import java.util.HashMap;
import java.util.Set;

public class PrintHashmap {
    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String,String> hashMap){
        Set set = hashMap.keySet();
        for (Object o : set) {
            System.out.println(o);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        Set set = hashmap.keySet();
        for (Object o : set) {
            String s = o.toString();
            if(s.contains(text)){
                System.out.println(s);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap,String text){
        for(String s: hashmap.keySet()){
            if(s.contains(text)){
                String value = hashmap.get(s);
                System.out.println(value);
            }
        }
    }






}

