package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        Map<String, String> queensLibrary = new LinkedHashMap<>();

        queensLibrary.put("Fiction", "Harry Potter and the Philospher's Stone");
        queensLibrary.put("Biography", "Malcolm X");
        queensLibrary.put("Mystery", "X Files");
        queensLibrary.put("Comic", "The Dark Knight Vol.1");


        for(Map.Entry<String, String> n: queensLibrary.entrySet()){
            System.out.println(n.getKey());
        }
    }

}
