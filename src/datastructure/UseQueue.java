package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {

        Queue<String> iPhone8ReleaseQueue = new LinkedList<>();

        iPhone8ReleaseQueue.add("Anand Snow");
        iPhone8ReleaseQueue.offer("Sukanta");
        iPhone8ReleaseQueue.offer("Fahim");
        iPhone8ReleaseQueue.add("Deb");

        iPhone8ReleaseQueue.remove("Fahim");

        for(String person: iPhone8ReleaseQueue){
            System.out.println(person + " is waiting for the iPhone 8 release");
        }




    }

}

