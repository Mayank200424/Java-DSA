package ObjectOrientedProgramming;

public class SuperKeyword {
    public static void main(String[] args) {
        Person p1 = new Person(2,"George",1,4);

    }
}
class Student{
   private int rNo;
   private String name;

    public Student(int rNo, String name) {
        this.rNo = rNo;
        this.name = name;
    }
}
class Person extends Student{
  private int age;
  private int sem;

    public Person(int rNo, String name, int age, int sem) {
        super(rNo,name);
        this.age = age;
        this.sem = sem;
    }

    private int setAge(){
        return age;
    }
}
