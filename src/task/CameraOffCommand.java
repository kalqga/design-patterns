package task;

public class CameraOffCommand implements Command {

    private Camera camera;

    public CameraOffCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.cameraOff();
    }
}
