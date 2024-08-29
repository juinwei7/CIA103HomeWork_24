package A20240821;

public class main {
    public static void main(String[] args) {
/*
        List<Student> students = new ArrayList<>();

        Student student_a = new Student("學生a");
        Student student_b = new Student("學生b");

        students.add(student_a);
        students.add(student_b);

        student_a.play(1);
        student_a.study(3);
        student_b.study(3);
        student_b.play(10);

        for (Student s : students){
            System.out.println(s.name+ ": " + s.score);
        }

 */
        int h = 8;
        System.out.println(getObjectType(h));

    }

    public static Class<?> getObjectType(Object obj) {
        if (obj == null) {
            return null; // 返回 null，如果对象是 null
        }

        return obj.getClass(); // 返回对象的 Class 对象
    }
}
