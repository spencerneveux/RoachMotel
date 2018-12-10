import java.util.ArrayList;

public class FrontDesk implements Subject {

    private ArrayList<Observing> observers;

    public FrontDesk() {
        observers = new ArrayList<Observing>();
    }


    @Override
    public void addWaitList(Observing newObserver) {

        observers.add(newObserver);
    }

    @Override
    public void removeWaitList(Observing deleteObserver) {
        int index = observers.indexOf(deleteObserver);
        System.out.println("Removing " + (index+1));
        observers.remove(index);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observing observer : observers) {
            observer.update();
        }
    }
}
