import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RevArrayList {
     public static void main(String args[]) { 
        List<String> books = new ArrayList<>();
        books.add("Beautiful Code");
        books.add("Clean Code");
        books.add("Working Effectively with Legacy Code");
        System.out.println("Original order of List: " + books);
        List<String> output = reverseListRecursively(books); 
        System.out.println("Reversed list reversed again: " + output); 
    }
        private static List<String> reverseListRecursively(List<String> list) 
        { if (list.size() <= 1) 
             return list;
        
        List<String> reversed = new ArrayList<>(); 
        reversed.add(list.get(list.size() - 1));
    }
}