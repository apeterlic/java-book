package dev.beenary.lesson11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> countriesByCode = new HashMap<>();
        countriesByCode.put("BE", "Belgium");
        countriesByCode.put("ES", "Spain");

        Set<String> keys = countriesByCode.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        Collection<String> values = countriesByCode.values();
        for (String value : values) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : countriesByCode.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        String country = countriesByCode.remove("UK");
        System.out.println(country); // United Kingdom

        System.out.println(countriesByCode.containsKey("UK")); // false
        System.out.println(countriesByCode.containsValue("United Kingdom")); // false

    }
}
