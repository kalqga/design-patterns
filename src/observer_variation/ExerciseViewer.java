package observer_variation;

public class ExerciseViewer implements Viewer{

    private String name;
    private Exercise exercise;

    public ExerciseViewer(String name) {
        this.setName(name);
    }

    @Override
    public void update() {
        if(exercise == null) {
            System.out.println(this.getName() + " is not doing anything at the moment");
            return;
        }

        String newExercise = exercise.getUpdate();
        System.out.println(this.getName() + " has started doing " + newExercise);
    }

    @Override
    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
