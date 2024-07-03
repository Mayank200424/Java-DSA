package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Basic_Comparator1 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(1,"Jay",2000));
        arrayList.add(new Employee(3,"Deep",1000));
        arrayList.add(new Employee(4,"Rahul",5000));
        arrayList.add(new Employee(2,"Harsh",6000));

        for (Employee employee : arrayList){
            System.out.println(employee.eid + " " + employee.name + " " + employee.salary);
        }
        Collections.sort(arrayList,new eid());
        System.out.println("After Eid Sorting : ");
        for (Employee employee : arrayList){
            System.out.println(employee.eid + " " + employee.name + " " + employee.salary);
        }
        Collections.sort(arrayList,new name());
        System.out.println("After Name Sorting : ");
        for (Employee employee : arrayList){
            System.out.println(employee.eid + " " + employee.name + " " + employee.salary);
        }
        Collections.sort(arrayList,new salary());
        System.out.println("After Salary Sorting : ");
        for (Employee employee : arrayList){
            System.out.println(employee.eid + " " + employee.name + " " + employee.salary);
        }
    }
}
class Employee{
    int eid;
    String name;
    int salary;

    public Employee(int eid, String name, int salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }
}
class eid implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.eid - o2.eid;
    }
}
class name implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
class salary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
    }
}