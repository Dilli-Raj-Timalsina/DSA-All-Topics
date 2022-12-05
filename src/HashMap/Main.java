package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",1000);
        hm.put("Nepal",100);
        hm.put("china",10);
        hm.put("bhutan",1);

        System.out.println(hm.get("Nepal"));
        System.out.println(hm.hashCode());
        System.out.println(hm);

    }

}
