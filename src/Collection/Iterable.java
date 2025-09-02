package Collection;

import java.util.ArrayList;
import java.util.*;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //iterable is used to iterate any data Structr
        //1) forEach loop
        //2) iterator

        //for Each loop
        for(Integer i: list){
            System.out.println(i);
        }


        ///using Iterator
        Iterator<Integer> li = list.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        ListIterator<Integer> i2 = list.listIterator();

        System.out.println(i2.next());
        System.out.println(i2.next());
        System.out.println(i2.previous());

    }

}
