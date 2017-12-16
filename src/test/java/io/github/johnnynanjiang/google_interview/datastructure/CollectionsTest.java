package io.github.johnnynanjiang.google_interview.datastructure;

import io.github.johnnynanjiang.google_interview.util.Print;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * Created by nanjiang on 16/12/17.
 */

public class CollectionsTest {
    @Test
    public void testHashSet() {
        HashSet<String> hashSet = new HashSet();

        hashSet.add("c");
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add(null);

        Print.toConsole(hashSet.toString());
    }

    @Test
    public void testHashMap() {
        HashMap<Integer, String> hashMap = new HashMap();

        hashMap.put(3, "c");
        hashMap.put(1, "a");
        hashMap.put(1, "a");
        hashMap.put(2, "b");

        Print.toConsole(hashMap.toString());
    }

    @Test
    public void testLinkedHashMap() {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap();

        linkedHashMap.put(3, "c");
        linkedHashMap.put(1, "a");
        linkedHashMap.put(1, "a");
        linkedHashMap.put(2, "b");
        linkedHashMap.put(null, "null");

        Print.toConsole(linkedHashMap.toString());
    }

    @Test
    public void testHashTable() {
        Hashtable<Integer, String> hashtable = new Hashtable();

        hashtable.put(3, "c");
        hashtable.put(1, "a");
        hashtable.put(1, "a");
        hashtable.put(2, "b");

        Print.toConsole(hashtable.toString());
    }
}
