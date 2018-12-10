public class FrontDeskObserver implements Observing {

    private Subject frontDesk;

    public FrontDeskObserver(Subject frontDesk) {
        this.frontDesk = frontDesk;
        frontDesk.addWaitList(this);
    }

    @Override
    public void update() {
        System.out.println("Received the notification");
    }
}
