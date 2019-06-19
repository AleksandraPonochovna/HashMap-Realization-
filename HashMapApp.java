package com.company.newMap;

public class HashMapApp {

    public static void main(String[] args) {
        MyHashMap<String, String> hashMap = new MyHashMap<>();
        hashMap.put("Hi 1", "It's element Hi 1");
        hashMap.put("Hi 2", "It's element Hi 2");
        hashMap.put("Hi 2", "It's element Hi 3");
        hashMap.put("Hi 3", "It's element Hi 4");
        hashMap.put("Hi 5", "It's element Hi 5");
        hashMap.put("Hi 6", "It's element Hi 6");
        hashMap.put("Hi 7", "It's element Hi 7");
        hashMap.put("Hi 8", "It's element Hi 8");
        hashMap.put("Hi 9", "It's element Hi 9");
        hashMap.put("Hi 10", "It's element Hi 10");
        hashMap.put(null, "It's element Hi 11");
        hashMap.put("Hi 11", "It's element Hi 12");
        hashMap.put("Hi 13", "It's element Hi 13");
        hashMap.put("Hi 14", "It's element Hi 14");
        hashMap.put("Hi 15", "It's element Hi 15");
        System.out.println(hashMap.get("Hi 11"));
        System.out.println(hashMap.get("Hi 1"));
        System.out.println(hashMap.get(null));  // It's element Hi 11
        //System.out.println(hashMap.get("-1")); // The value with key -1 is not found.
        System.out.println(hashMap.get("Hi 15")); // It's element Hi 15
        System.out.println(hashMap.get("Hi 7")); // It's element Hi 7
        System.out.println(hashMap.get("Hi 8")); // It's element Hi 8
        System.out.println(hashMap.get("Hi 9")); // It's element Hi 9
    }
}
