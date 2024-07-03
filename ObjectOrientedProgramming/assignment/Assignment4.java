package ObjectOrientedProgramming.assignment;

public class Assignment4 {
    public static void main(String[] args) {
        Student2 student2 = new Student2();
        Student2[] students = new Student2[5];
        students[0] = new Student2(1,"Rahul",55,65,98);
        students[1] = new Student2(2,"Mayank",56,23,89);
        students[2] = new Student2(3,"Het",49,55,78);
        students[3] = new Student2(4,"Ankur",75,69,92);
        students[4] = new Student2(5,"Vandan",75,55,58);

        student2.getTop3Student(students);

    }
}
class Student2{
    int rNo;
    String name;
    int marks1;
    int marks2;
    int marks3;
    int totalMarks;

  Student2(int rNo, String name, int marks1, int marks2, int marks3) {
        this.rNo = rNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.totalMarks = marks1 + marks2 + marks3;
    }

    public Student2() {

    }
    public void getTop3Student(Student2[] student2)
    {
        for(int i=0;i<student2.length-1;i++)
        {
            for(int j=0;j<student2.length - i - 1;j++)
            {
                if(student2[j].totalMarks < student2[j+1].totalMarks)
                {
                    Student2 temp = student2[j];
                    student2[j] = student2[j+1];
                    student2[j+1] = temp;
                }
            }
        }
        for (int i=0;i<3;i++)
        {
            System.out.println(student2[i].name + "  " + student2[i].totalMarks);
        }
    }

}
