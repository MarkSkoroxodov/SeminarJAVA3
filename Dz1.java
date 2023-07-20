import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Dz1{
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 12345678, bookPhone);
        addNumber("Ivanov", 12344321, bookPhone);
        addNumber("Petrov", 546585412, bookPhone);
        addNumber("Sidorov", 895647711, bookPhone);
        addNumber("Ivanov", 12356233, bookPhone);
        addNumber("Petrov", 99091234, bookPhone);
        printBook(bookPhone);
    }
}
