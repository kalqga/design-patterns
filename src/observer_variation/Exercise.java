package observer_variation;

public interface Exercise {
    void watch(Viewer exerciseViewer);
    void stopWatching(Viewer exerciseViewer);
    void notifyViewers();
    String getUpdate();
}
