import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
public class RevArrayList {
    public static void main(String args[]) { 
        List<String> names = new ArrayList<>();
        names.add("Ajay");
        names.add("Yash");
        names.add("Shlok");
        names.add("Parth");
        names.add("Xavier");
        System.out.println("Original order of List: " + names);
        List<String> output = reverseListRecursively(names); 
        System.out.println("List in reversed order: " + output); 
    }
    private static List<String> reverseListRecursively(List<String> list) {
          if (list.size() <= 1) 
             return list;
        List<String> reversed = new ArrayList<>(); 
        reversed.add(list.get(list.size() - 1));
        reversed.addAll(reverseListRecursively(list.subList(0, list.size() - 1)));
        return reversed;
    }
}
