package task;

public class Instructor {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void startRecording() {
        this.command.execute();
    }

}
