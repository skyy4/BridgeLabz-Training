package com.example.listmanager;

import java.util.List;

public class ListManager {

    public void addElement(List<Integer> l, int e) {
        l.add(e);
    }

    public void removeElement(List<Integer> l, int e) {
        l.remove(Integer.valueOf(e));
    }

    public int getSize(List<Integer> l) {
        return l.size();
    }
}
