package day0603;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "자료0");
        hashMap.put(1, "자료1");
        hashMap.put(2, "자료2");

        String str1 = hashMap.get(1);
        String str2 = hashMap.get(2);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsKey(3));

        System.out.println(hashMap.containsValue("자료1"));
        System.out.println(hashMap.containsValue("자료3"));

        System.out.println(hashMap.size());
        System.out.println(hashMap.remove(1));
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.remove(2));
        System.out.println(hashMap.isEmpty());
    }
}
