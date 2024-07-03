package ObjectOrientedProgramming;

public class Student1 {
    public static void main(String[] args) {
        student s1 = new student(1,"Mayank",20);
        student s2 = new student();
        s1.setPer(80.3);
        student s3 = new student(s1);
        System.out.println(s3.getrno() + " "+ s3.getName()+" "+s3.getAge()+" "+s3.getPer());
        System.out.println(s1.getrno() + " "+ s1.getName()+" "+s1.getAge()+" "+s1.getPer());
    }
}
class student{
    private int rno;
    private String name;
    private int age;
    private double per;

    student(){} // Default Constructor
    student(int rno,String name,int age){ // Parameterised Constructor
        this.rno = rno;
        this.name = name;
        this.age = age;
    }

    student(student oldstudent){ // Copy Constructor
        this.rno = oldstudent.rno;
        this.name = oldstudent.name;
        this.age = oldstudent.age;
        this.per = oldstudent.per;
    }

    public void setPer(Double per){
        this.per = per;
    } //Setter Method

    public int getrno(){
        return rno;
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public double getPer() {
        return per;
    }
}
