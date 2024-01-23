package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    private Map<String, Set<Long>> records;
    private Set<Long> phoneList;

    PhoneBook() {
        records = new HashMap<>();
        phoneList = new HashSet<>();
    }

    public void addNewRecord(String name, long phoneNumber) {
        if (phoneList.contains(phoneNumber)) {
            records.get(findNameByPhoneNumber(phoneNumber)).remove(phoneNumber);
        }
        if (!records.containsKey(name)) {
            Set<Long> newList = new TreeSet<>();
            records.put(name, newList);
        }
        records.get(name).add(phoneNumber);
        phoneList.add(phoneNumber);
    }

    public String findNameByPhoneNumber(long phoneNumber) {
        for (Map.Entry<String, Set<Long>> entry : records.entrySet()) {
            for (long phone : entry.getValue()) {
                if (phoneNumber == phone) return entry.getKey();
            }
        }
        return "";
    }


    public void printPhoneBook() {
        Map<String, Integer> valueSizeMap =
                records.entrySet().stream()
                        .collect(Collectors.toMap(
                                e -> e.getKey(),
                                e -> e.getValue().size()
                        ));

        LinkedHashMap<String, Integer> sortedMap = valueSizeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), Map::putAll);

        Set<String> keys = sortedMap.keySet();
        for (String key : keys) {
            System.out.print("[" + key + ":" + records.get(key) + "]  " );
        }
    }

}
