package ObjectOrientedProgramming;

public class Aggregation {
    public static void main(String[] args) {
        Stud student = new Stud(1,"Raj",22,101,"MadhavBag","Surat");
        student.Display();
    }
}
class Address{
    int hNo;
    String soc;
    String city;

    public Address(int hNo, String soc, String city) {
        this.hNo = hNo;
        this.soc = soc;
        this.city = city;
    }
}
class Stud{
    int rNo;
    String name;
    int age;
    Address address;

    public Stud(int rNo, String name, int age,int hNo,String soc,String city) {
        this.rNo = rNo;
        this.name = name;
        this.age = age;
        this.address = new Address(hNo, soc, city);
    }

    public void Display(){
        System.out.println("Rno : " + rNo);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("hNo : " + address.hNo);
        System.out.println("Soc : " + address.soc);
        System.out.println("City : " + address.city);
    }
}
