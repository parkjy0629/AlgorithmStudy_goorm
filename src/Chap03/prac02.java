package Chap03;

import javafx.util.Pair;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class prac02 {
    public static void main(String[] args) {
        List <Pair<Integer, String>> list = new LinkedList<>();

        list.add(new Pair<>(99, "TEST1"));
        list.add(new Pair<>(70, "TEST2"));
        list.add(new Pair<>(58, "TEST3"));
        list.add(new Pair<>(86, "TEST4"));
        list.add(new Pair<>(77, "TEST5"));

        Collections.sort(list, new Comparator<Pair<Integer, String>>() {
            @Override
            public int compare(Pair<Integer, String> o1, Pair<Integer, String> o2) {
                return (o1.getKey() != o2.getKey() ? o2.getKey() - o1.getKey() : o2.getValue().compareTo(o1.getValue()));
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey());
            System.out.println(list.get(i).getValue());
        }
    }
}
