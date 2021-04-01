package task;

import java.util.ArrayList;
import java.util.List;

public class Instructor implements Exercise {

    public List<Viewer> viewers;
    public String exercise;
    private Command command;

    public Instructor() {
        this.viewers = new ArrayList<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void record() {
        this.command.execute();
    }

    @Override
    public void watch(Viewer exerciseViewer) {
        this.viewers.add(exerciseViewer);
        exerciseViewer.setExercise(this);
    }

    @Override
    public void stopWatching(Viewer exerciseViewer) {
        this.viewers.remove(exerciseViewer);
    }

    @Override
    public void notifyViewers() {
        for(Viewer viewer: this.viewers) {
            viewer.update();
        }
    }

    @Override
    public String getUpdate() {
        return null;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
        this.notifyViewers();
    }
}
