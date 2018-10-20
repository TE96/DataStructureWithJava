import java.util.ArrayList;

public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BST<E> bst;

    public BSTSet(){
        bst = new BST<>();
    }

    @Override
    public int getSize(){
        return bst.size();
    }

    @Override
    public boolean isEmpty(){
        return bst.isEmpty();
    }

    @Override
    public void add(E e){
        bst.add(e);
    }

    @Override
    public boolean contains(E e){
        return bst.contains(e);
    }

    @Override
    public void remove(E e){
        bst.remove(e);
    }

//    public static void main(String[] args) {
//        // write your code here
//
//        System.out.println("Pride and Prejudice");
//
//        ArrayList<String> words1 = new ArrayList<>();
//        FileOperation.readFile("/home/fuwuchen/Desktop/pride-and-prejudice.txt", words1);
//        System.out.println("Total words: " + words1.size());
//
//        BSTSet<String> set1 = new BSTSet<>();
//        for(String word:words1)
//            set1.add(word);
//        System.out.println("Total different words: " + set1.getSize());
//    }
}
