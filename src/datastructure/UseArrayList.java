package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Bob");
        arrayList.add("Joe");
        arrayList.add("Tim");
        arrayList.add("Abe");
        arrayList.add("Jon");
        arrayList.add("Sal");

       // System.out.println(arrayList.get(arrayList.size()-2));

        arrayList.remove("Jon");
        arrayList.remove(1);

        for(String name: arrayList){
            System.out.println(name);
        }

        System.out.println();

        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
