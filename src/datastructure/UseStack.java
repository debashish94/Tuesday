package datastructure;

import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {

        Stack<String> cakeStack = new Stack<>();

        cakeStack.push("Pound cake 1");
        cakeStack.push("Chocolate frosting");
        cakeStack.push("Pound cake 2");
        cakeStack.push("Cream frosting");
        cakeStack.push("Happy Birthday Dog Decoration");

        cakeStack.remove(0);

        cakeStack.remove(1);

        for(String layer: cakeStack){
            System.out.println(layer);
        }

    }
}
