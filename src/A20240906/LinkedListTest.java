package A20240906;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        linkedListTest();
    }

    public static void linkedListTest(){

        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int i = 1; i<100; i++){
            linkedList.add(i);
        }

//        linkedList.addFirst(10);
//        linkedList.addLast(10);
//        linkedList.remove(<索引>);
//        linkedList.removeFirst();
//        linkedList.add(<索引>, 10);

        for (int i : linkedList){
            System.out.print(i + ", ");
        }

    }
}
