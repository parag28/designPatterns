package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable){
        this.observable = observable;
        this.username = username;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "Product is in stock, lets go!");
    }

    private void sendMsgOnMobile(String username, String msg){
        System.out.println("Msg sent to: " + username);
    }
}
