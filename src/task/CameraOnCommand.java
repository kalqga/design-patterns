package task;

public class CameraOnCommand implements Command {

    private Camera camera;

    public CameraOnCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.cameraOn();
    }
}
