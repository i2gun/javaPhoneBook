package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    private final Map<String, PhoneBookKey> records;
    private final Set<Long> phoneList;

    PhoneBook() {
        records = new TreeMap<>();
        phoneList = new HashSet<>();
    }

    public void addNewRecord(String name, long phoneNumber) {
        if (name.isEmpty()) return;
        if (phoneNumber < 10000000000L || phoneNumber > 100000000000L) return;
        if (phoneList.contains(phoneNumber)) return;

        if (!records.containsKey(name)) {
            records.put(name, new PhoneBookKey(new TreeSet<>()));
        }
        records.get(name).addPhone(phoneNumber);
        phoneList.add(phoneNumber);
    }

    public void printPhoneBook() {
        Map<String, Integer> valueSizeMap =
                records.entrySet().stream()
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                e -> e.getValue().getCount()
                        ));

        LinkedHashMap<String, Integer> sortedMap = valueSizeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), Map::putAll);

        Set<String> keys = sortedMap.keySet();
        for (String key : keys) {
            System.out.print("[" + key + ":" + records.get(key).getPhoneList() + "]  " );
        }
    }

}