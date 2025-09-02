package Collection;

import java.lang.*;
import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        LinkedList<Object> list2=new LinkedList<>();
        list2.add(1);
        list2.remove();
        list.get(1);
        list.add(1);
        list.get(0);
        list.remove(0);
        list.clear();
        list.remove(0);
        list.addAll(new ArrayList<>(2));
        list.add(2,78);
        list.addAll(2,new ArrayList<>());
        list.contains(1);
        list.containsAll(new ArrayList<>());
        list.clear();
        list.size();
        Set<Integer> set = new HashSet<>();
        set.add(1);
        Set<Integer> set2 = new LinkedHashSet<>();
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        pq.add(1);
        //this is in list only not in queue but above is in collection so it support all
        //pq.add(1,2);
        java.util.Collection<Integer> c = new ArrayList<>();
        Stack<Integer>stack=new Stack<>();


    }


}
