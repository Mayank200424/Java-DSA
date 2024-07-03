package ObjectOrientedProgramming;

public class Inhertance {
    public static void main(String[] args) {
        student2 student2 = new student2();
        student2.name = "Vivek";
        System.out.println(student2.getName());
    }
}
class person{
    String name;
    int age;
    int contact;
    public String getName(){
        return name;
    }
}
class Employee extends person{ // single Inhertance
    int empid;
    int salary;
}
class student2 extends person{ // Hierarechical Inhertance
    int rno;
    int sem;
}
class prof extends Employee{  // Multilevel Inhertance
    String[] subject;
}
