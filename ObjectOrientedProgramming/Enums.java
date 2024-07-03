package ObjectOrientedProgramming;

public class Enums {
    public static void main(String[] args) {
        Holiday h1 = new Holiday("RDay",26,MonthName.January);
        Holiday h2 = new Holiday("Uttrayan",14,MonthName.January);
        Holiday h3 = new Holiday("Holi",26,MonthName.march);

        System.out.println(h1.isSameMonth(h3));


    }
}
class Holiday{
    String name;
    int day;
    MonthName monthName;

    public boolean isSameMonth(Holiday h){
        if(this.monthName.equals(h.monthName)){
            return true;
        }
        return false;
    }

    public Holiday(String name, int day, MonthName monthName) {
        this.name = name;
        this.day = day;
        this.monthName = monthName;
    }
}
enum MonthName {
    January,february,march,april,may,jun
}
