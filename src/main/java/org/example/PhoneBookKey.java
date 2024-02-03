package org.example;

import java.util.Set;

public class PhoneBookKey {

    private int count;
    private final Set<Long> phoneList;

    PhoneBookKey(Set<Long> phoneList) {
        this.phoneList = phoneList;
        this.count = phoneList.size();
    }

    public void addPhone(Long number) {
        this.phoneList.add(number);
        count++;
    }

    public boolean removePhone(Long number) {
        if (this.phoneList.contains(number)) {
            this.phoneList.remove(number);
            count--;
            return true;
        } else {
            return false;
        }
    }

    public int getCount() {
        return count;
    }

    public Set<Long> getPhoneList() {
        return this.phoneList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PhoneBookKey) {
            return this.count == ((PhoneBookKey) obj).count;
        } else return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}
