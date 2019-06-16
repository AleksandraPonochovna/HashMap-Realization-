package com.company.newMap;

public interface HashMap<K, V> {
    public void put(K key, V value);
    public V get(K key);
    void increase();
    public void clear();
    public boolean isEmpty();
    public int size();
}

