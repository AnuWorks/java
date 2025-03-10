package dsa;

import java.util.Hashtable;

public class DSAHashTable {

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10, 0.5f);
        Hashtable<String, String> tables = new Hashtable<>(10, 0.5f);

        table.put(100, "sponge bob");
        table.put(123, "Sandy");
        table.put(321, "Gary");
        table.put(777, "Priya");

        //table.remove(777);

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
        System.out.println("********************");
        tables.put("100", "sponge bob");
        tables.put("123", "Sandy");
        tables.put("321", "Gary");
        tables.put("777", "Priya");

        for (String key : tables.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }


    }
}
