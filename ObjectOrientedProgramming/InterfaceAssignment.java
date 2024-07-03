package ObjectOrientedProgramming;

public class InterfaceAssignment {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.GearChange();
        bicycle.GearChange();
        bicycle.GearChange();

        Bike bike = new Bike();
        bike.GearChange();
        bike.GearChange();
        bike.GearChange();
        bike.GearChange();

        Car car = new Car();
        car.GearChange();
        car.GearChange();
        car.GearChange();
        car.GearChange();
        car.GearChange();
        car.GearChange();
    }

}
interface Vehicles{
    void GearChange();
}
class Bicycle implements Vehicles{
    int Gear = 1;
   public void GearChange(){
        if(Gear > 2)
        {
            System.out.println("*Gear Limit Reached for your Bicycle");
            return;
        }
       System.out.print("Gear"+" " +Gear+"  ");
       Gear++;
    }
}
class Bike implements Vehicles{
    int Gear = 1;

    public void GearChange() {
        if(Gear > 3){
            System.out.println("*Gear Limit Reached for your Bike");
            return;
        }
        System.out.print("Gear"+" " +Gear+"  ");
        Gear++;
    }
}
class Car implements Vehicles{
    int Gear = 1;

    @Override
    public void GearChange() {
        if(Gear > 5){
            System.out.println("*Gear Limit Reached for your Car");
            return;
        }
        System.out.print("Gear"+" " +Gear+"  ");
        Gear++;
    }
}