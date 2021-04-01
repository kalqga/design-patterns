package task;

public class ViewerMain {
    public static void main(String[] args) {


        Instructor instructor = new Instructor();
        Camera camera = new Camera();
        Command startRecording = new CameraOnCommand(camera);

        instructor.setCommand(startRecording);
        instructor.startRecording();


        Trainer trainer = new Trainer();
        Viewer vie1 = new ExerciseViewer("Yotsuba");
        Viewer vie2 = new ExerciseViewer("Miku");
        Viewer vie3 = new ExerciseViewer("Nino");


        trainer.watch(vie1);
        trainer.watch(vie2);
        trainer.watch(vie3);

        trainer.setExercise("Deadlift");
    }
}
