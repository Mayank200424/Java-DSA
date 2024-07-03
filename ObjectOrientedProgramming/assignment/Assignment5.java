package ObjectOrientedProgramming.assignment;

public class Assignment5 {
    public static void main(String[] args) {
        Holiday[] holidays = new Holiday[3];
        holidays[0] = new Holiday("RepublicDay",26,"january");
        holidays[1] = new Holiday("utrayan",14,"january");
        holidays[2] = new Holiday("holi",25,"march");

        System.out.println(holidays[0].inSameMonth(holidays[1]));
        System.out.println(holidays[0].avgDate(holidays));

    }
}
class Holiday{
    String name;
    int day;
    String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday holiday)
    {
        if(this.month.equals(holiday.month))
        {
            return true;
        }
        return false;
    }

    public double avgDate(Holiday[] holidays)
    {
        int sum=0;
        for (int i=0;i<holidays.length;i++)
        {
            sum = sum + holidays[i].day;
        }
        return sum/holidays.length;
    }
}
