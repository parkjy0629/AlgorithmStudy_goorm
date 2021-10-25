package Chap03;

import javafx.util.Pair;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class prac03 {
    public static void main(String[] args) {
        List <Pair<String, Pair<Integer, Integer>>> list = new LinkedList<>();

        list.add(new Pair<String, Pair<Integer, Integer>>("TEST1", new Pair<Integer,Integer>(90, 19991111)));
        list.add(new Pair<String, Pair<Integer, Integer>>("TEST2", new Pair<Integer,Integer>(70, 19990101)));
        list.add(new Pair<String, Pair<Integer, Integer>>("TEST3", new Pair<Integer,Integer>(58, 19990202)));
        list.add(new Pair<String, Pair<Integer, Integer>>("TEST4", new Pair<Integer,Integer>(86, 19990303)));
        list.add(new Pair<String, Pair<Integer, Integer>>("TEST5", new Pair<Integer,Integer>(77, 19991212)));

        Collections.sort(list, new Comparator<Pair<String, Pair<Integer, Integer>>>() {
            @Override
            public int compare(Pair<String, Pair<Integer, Integer>> o1, Pair<String, Pair<Integer, Integer>> o2) {
                return (o1.getValue().getKey() != o2.getValue().getKey() ? o2.getValue().getKey() - o1.getValue().getKey() : o2.getValue().getKey().compareTo(o1.getValue().getValue()));
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey());
            System.out.println(list.get(i).getValue());
        }
    }
}
