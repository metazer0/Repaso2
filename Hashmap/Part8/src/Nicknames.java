import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("Matthew","Matt");
        hashmap.put("Michael","Mix");
        hashmap.put("Arthur","artie");

        String nickname = hashmap.get("Matthew");
        System.out.println(nickname);
    }
}