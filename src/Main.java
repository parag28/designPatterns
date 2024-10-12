import Strategy.GoodsVehicle;
import Strategy.OffRoadVehicle;
import Strategy.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle obj = new OffRoadVehicle();
        obj.drive();
    }
}