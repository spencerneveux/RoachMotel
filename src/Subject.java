public interface Subject {
    public void addWaitList(Observing o);
    public void removeWaitList(Observing o);
    public void notifyObserver();
}
