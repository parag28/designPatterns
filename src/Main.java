import DecoratorPattern.BasePizza;
import DecoratorPattern.ExtraCheese;
import DecoratorPattern.Mushroom;
import DecoratorPattern.VegDelight;
import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;
import Strategy.GoodsVehicle;
import Strategy.OffRoadVehicle;
import Strategy.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Strategy Pattern
//        Vehicle obj = new OffRoadVehicle();
//        obj.drive();

//        Observer Pattern
//        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
//        StocksObservable iphoneStockObservable1 = new IphoneObservableImpl();
//        NotificationAlertObserver ob1 = new EmailAlertObserverImpl("ayy@gmail.com", iphoneStockObservable);
//        NotificationAlertObserver ob2 = new EmailAlertObserverImpl("kay@gmail.com", iphoneStockObservable);
//        NotificationAlertObserver ob3 = new MobileAlertObserverImpl("99009900990", iphoneStockObservable1);
//
//        iphoneStockObservable.add(ob1);
//        iphoneStockObservable.add(ob2);
//        iphoneStockObservable.add(ob3);
//
//        iphoneStockObservable.setStockCount(0);

//        Decorator Pattern
        BasePizza pizza = new ExtraCheese(new Mushroom(new VegDelight()));
        System.out.println(pizza.cost());
    }
}