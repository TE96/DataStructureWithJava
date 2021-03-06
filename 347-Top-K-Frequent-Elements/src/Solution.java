import java.util.*;

class Solution {

//    private class Freq{
//        public int e, freq;
//
//        public Freq(int e, int freq){
//            this.e = e;
//            this.freq = freq;
//        }

//        @Override
//        public int compareTo(Freq another){
//            if(this.freq < another.freq)
//                return -1;
//            else if(this.freq > another.freq)
//                return 1;
//            else
//                return 0;
//        }
//    }

//    private class FreqComparator implements Comparator<Freq>{
//
//        @Override
//        public int compare(Freq a, Freq b){
//            return a.freq - b.freq;
//        }
//    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num: nums) {
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return map.get(a) - map.get(b);
            }
//            (a, b) -> map.get(a) - map.get(b)
        });
        for(int key: map.keySet()){
            if(pq.size() < k)
                pq.add(key);
            else if(map.get(key) > map.get(pq.peek())){
                pq.remove();
                pq.add(key);
            }
        }

        LinkedList<Integer> res = new LinkedList<>();
        while (!pq.isEmpty())
            res.add(pq.remove());
        return res;
    }

    public static void main(String[] args) {

        int[] testData = {1,1,1,2,2,3};
        Solution solution = new Solution();
        List res = solution.topKFrequent(testData, 2);
        System.out.println(res);
    }
}