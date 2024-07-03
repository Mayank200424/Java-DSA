package ObjectOrientedProgramming.assignment;

import java.util.Arrays;

public class Assignment7 {
    public static void main(String[] args) {
        SalarySlip[] ss = new SalarySlip[36];

        ss[0] = new SalarySlip(1001, "emp1", 10000, Month.month1);
        ss[1] = new SalarySlip(1001, "emp1", 70000, Month.month2);
        ss[2] = new SalarySlip(1001, "emp1", 40000, Month.month3);
        ss[3] = new SalarySlip(1001, "emp1", 50000, Month.month4);
        ss[4] = new SalarySlip(1001, "emp1", 30000, Month.month5);
        ss[5] = new SalarySlip(1001, "emp1", 40000, Month.month6);

        ss[6] = new SalarySlip(1002, "emp2", 70000, Month.month1);
        ss[7] = new SalarySlip(1002, "emp2", 60000, Month.month2);
        ss[8] = new SalarySlip(1002, "emp2", 40000, Month.month3);
        ss[9] = new SalarySlip(1002, "emp2", 40000, Month.month4);
        ss[10] = new SalarySlip(1002,"emp2", 40000, Month.month5);
        ss[11] = new SalarySlip(1002,"emp2", 20000, Month.month6);

        ss[12] = new SalarySlip(1003, "emp3", 20000, Month.month1);
        ss[13] = new SalarySlip(1003, "emp3", 20000, Month.month2);
        ss[14] = new SalarySlip(1003, "emp3", 50000, Month.month3);
        ss[15] = new SalarySlip(1003, "emp3", 60000, Month.month4);
        ss[16] = new SalarySlip(1003, "emp3", 70000, Month.month5);
        ss[17] = new SalarySlip(1003, "emp3", 80000, Month.month6);

        ss[18] = new SalarySlip(1004, "emp4", 90000, Month.month1);
        ss[19] = new SalarySlip(1004, "emp4", 90000, Month.month2);
        ss[20] = new SalarySlip(1004, "emp4", 80000, Month.month3);
        ss[21] = new SalarySlip(1004, "emp4", 70000, Month.month4);
        ss[22] = new SalarySlip(1004, "emp4", 30000, Month.month5);
        ss[23] = new SalarySlip(1004, "emp4", 10000, Month.month6);

        ss[24] = new SalarySlip(1005, "emp5", 10000, Month.month1);
        ss[25] = new SalarySlip(1005, "emp5", 30000, Month.month2);
        ss[26] = new SalarySlip(1005, "emp5", 40000, Month.month3);
        ss[27] = new SalarySlip(1005, "emp5", 40000, Month.month4);
        ss[28] = new SalarySlip(1005, "emp5", 60000, Month.month5);
        ss[29] = new SalarySlip(1005, "emp5", 90000, Month.month6);

        ss[30] = new SalarySlip(1006, "emp6", 50000, Month.month1);
        ss[31] = new SalarySlip(1006, "emp6", 50000, Month.month2);
        ss[32] = new SalarySlip(1006, "emp6", 30000, Month.month3);
        ss[33] = new SalarySlip(1006, "emp6", 30000, Month.month4);
        ss[34] = new SalarySlip(1006, "emp6", 70000, Month.month5);
        ss[35] = new SalarySlip(1006, "emp6", 80000, Month.month6);

        SalarySlip.calculateTop2(ss);
    }
}
class SalarySlip {
    private String name;
    private int id;
    private double salary;
    private Month month;

    public SalarySlip(int id, String name, double salary, Month month) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.month = month;
    }

    public static void calculateTop2(SalarySlip[] ss) {

        //-----------------------------------------month 1-----------------------------------------------------------------
        int smax = 0, fmax = 0;
        for (int i = 0; i < 36; i += 6) {
            if (ss[i].month.equals(Month.month1)) {
                if (ss[i].salary > ss[fmax].salary) {
                    smax = fmax;
                    fmax = i;
                } else if (ss[i].salary > ss[smax].salary && ss[i].salary < ss[fmax].salary) {
                    smax = i;
                }
            }
        }
        System.out.println("Month 1 -> " + ss[fmax].id + " " + ss[smax].id);

        //-----------------------------------------month 2-----------------------------------------------------------------
        smax = -1;
        fmax = 0;
        for (int i = 1; i < 36; i += 6) {
            if (ss[i].month.equals(Month.month2)) {
                if (ss[i].salary > ss[fmax].salary) {
                    smax = fmax;
                    fmax = i;
                } else if (ss[i].salary > ss[smax].salary && ss[i].salary < ss[fmax].salary) {
                    smax = i;
                }
            }
        }
        System.out.println("Month 2 -> " + ss[fmax].id + " " + ss[smax].id);

        //-----------------------------------------month 3-----------------------------------------------------------------
        smax = -1;
        fmax = 0;
        for (int i = 2; i < 36; i += 6) {
            if (ss[i].month.equals(Month.month3)) {
                if (ss[i].salary > ss[fmax].salary) {
                    smax = fmax;
                    fmax = i;
                } else if (ss[i].salary > ss[smax].salary && ss[i].salary < ss[fmax].salary) {
                    smax = i;
                }
            }
        }
        System.out.println("Month 3 -> " + ss[fmax].id + " " + ss[smax].id);

        //-----------------------------------------month 4-----------------------------------------------------------------
        smax = -1;
        fmax = 0;
        for (int i = 3; i < 36; i += 6) {
            if (ss[i].month.equals(Month.month4)) {
                if (ss[i].salary > ss[fmax].salary) {
                    smax = fmax;
                    fmax = i;
                } else if (ss[i].salary > ss[smax].salary && ss[i].salary < ss[fmax].salary) {
                    smax = i;
                }
            }
        }
        System.out.println("Month 4 -> " + ss[fmax].id + " " + ss[smax].id);
        //-----------------------------------------month 5-----------------------------------------------------------------
        smax = -1;
        fmax = 0;
        for (int i = 4; i < 36; i += 6) {
            if (ss[i].month.equals(Month.month5)) {
                if (ss[i].salary > ss[fmax].salary) {
                    smax = fmax;
                    fmax = i;
                } else if (ss[i].salary > ss[smax].salary && ss[i].salary < ss[fmax].salary) {
                    smax = i;
                }
            }
        }
        System.out.println("Month 5 -> " + ss[fmax].id + " " + ss[smax].id);
        //-----------------------------------------month 6-----------------------------------------------------------------
        smax = -1;
        fmax = 0;
        for (int i = 5; i < 36; i += 6) {
            if (ss[i].month.equals(Month.month6)) {
                if (ss[i].salary > ss[fmax].salary) {
                    smax = fmax;
                    fmax = i;
                } else if (ss[i].salary > ss[smax].salary && ss[i].salary < ss[fmax].salary) {
                    smax = i;
                }
            }
        }
        System.out.println("Month 6 -> " + ss[fmax].id + " " + ss[smax].id);
    }
}
enum Month {
    month1, month2, month3, month4, month5, month6
}