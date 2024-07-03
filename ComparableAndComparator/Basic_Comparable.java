package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Basic_Comparable {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(2,"Raj",30));
        arrayList.add(new Student(5,"Neel",50));
        arrayList.add(new Student(3,"Deep",20));
        arrayList.add(new Student(1,"Jay",10));
        arrayList.add(new Student(4,"Path",25));
        for (Student student : arrayList){
            System.out.println(student.rNo + " " + student.name + " " + student.marks);
        }
        Collections.sort(arrayList);
        System.out.println("After Rno Sorting : ");
        for (Student student : arrayList){
            System.out.println(student.rNo + " " + student.name + " " + student.marks);
        }

    }
}
class Student implements Comparable<Student>{
    int rNo;
    String name;
    int marks;

    public Student(int rNo, String name, int marks) {
        this.rNo = rNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if(this.marks > o.marks){
            return 1;
        } else if (this.marks < o.marks) {
            return -1;
        }
        return 0;
    }
}
