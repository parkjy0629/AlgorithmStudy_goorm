package Chap03;

import java.util.Arrays;
import java.util.Collections;

public class prac01 {
    public static class Student implements Comparable {
        private final String name;
        private final Integer score;

        public Student (String name, int score) {
            this.name = name;
            this.score = score;
        }

        public Integer getScoreInteger() {
            return this.score;
        }

        @Override
        public boolean equals(Object obj) {
            return ((Student) obj).getScoreInteger().equals(getScoreInteger()) ;
        }

        @Override
        public int compareTo(Object o) {
            Student e = (Student) o;
            return getScoreInteger().compareTo(e.getScoreInteger());
        }

        @Override
        public String toString() {
            return "Student(name = " + name + ", score = " + score + ")\n";
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("TEST1", 93),
                new Student("TEST2", 90),
                new Student("TEST3", 85),
                new Student("TEST4", 76),
                new Student("TEST5", 88)
        };

        System.out.println("정렬 전");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].toString());
        }
        System.out.println();

        System.out.println("정렬 후 [오름차순]");
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].toString());
        }
        System.out.println();

        System.out.println("정렬 후 [내림차순]");
        Arrays.sort(students, Collections.reverseOrder());
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].toString());
        }
    }
}
