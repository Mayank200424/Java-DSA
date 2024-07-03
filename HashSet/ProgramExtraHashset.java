package HashSet;

import java.util.HashSet;
import java.util.Objects;

public class ProgramExtraHashset {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(new Student(1,"aaa"));
        hashSet.add(new Student(2,"bbb"));
        hashSet.add(new Student(1,"aaa"));
        hashSet.add(new Student(2,"bbb"));
        System.out.println(hashSet.size());

    }
}
class Student{
    int rNo;
    String name;

    public Student(int rNo, String name) {
        this.rNo = rNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rNo == student.rNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rNo, name);
    }
}
