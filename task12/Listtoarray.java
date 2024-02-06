package task12;

import java.util.ArrayList;
import java.util.List;

public class Listtoarray {
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        stringList.add("Miles");
        stringList.add("Peter");
        stringList.add("Edward Norton");
        stringList.add("Burcewayne");

        
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

       
        System.out.println("Elements of the array:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
