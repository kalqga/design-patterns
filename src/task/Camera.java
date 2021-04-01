package task;

public class Camera {

    private Boolean record;

    public void cameraOn() {
        System.out.println("Instructor has started recording...");
        this.record = true;
    }

    public void cameraOff() {
        System.out.println("The session has ended");
        this.record = false;
    }

}
