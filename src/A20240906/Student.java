package A20240906;

import java.util.*;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        // 按分數升序排序
        return Integer.compare(this.score, other.score);
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, score);
    }

    public static void main(String[] args) {
        // 創建學生陣列
//        Student[] students = {
//                new Student("Alice", 90),
//                new Student("Bob", 85),
//                new Student("Charlie", 95)
//        };
//
        Student s1 = new Student("Alice", 90);
        Student s2 = new Student("Rlice", 80);

        TreeSet<Student> students = new TreeSet<>();
        students.add(s1);
        students.add(s2);

        for (Student dd : students){
            System.out.println(dd.name + ", " + dd.score);

        }

//        if (s1.equals(s2)){
//            System.out.println("true");
//            System.out.println(s1.hashCode() + "  " + s2.hashCode());
//        }else{
//            System.out.println("false");
//            System.out.println(s1.hashCode() + "  " + s2.hashCode());
//        }



//        Collections.sort(students);
//        Arrays.sort(students);
//
//        for (Student student1 : students){
//            System.out.println("student name: " + student1.name + ", score: " + student1.score);
//        }
    }
}