package Strategy;

public class Vehicle implements DriveStrategy{
    DriveStrategy obj;
    Vehicle(DriveStrategy obj){
        this.obj = obj;
    }
    public void drive(){
        obj.drive();
    }
}
