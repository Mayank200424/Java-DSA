package ObjectOrientedProgramming.assignment;

public class Assignment1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudDetails(1,"Mayank",70,80,60);
        s1.display();

    }

}
class Student{
    int rno,marks1,marks2,marks3,totalmarks;
    String name;



    public void setStudDetails(int rno, String name, int marks1, int marks2, int marks3){
        this.rno = rno;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int calculateTotal(int marks1,int marks2,int marks3) {
      return totalmarks = marks1 + marks2 + marks3;
    }

    public void display(){
        System.out.println(rno + " " + name + " " + calculateTotal(marks1,marks2,marks3));
    }
}
