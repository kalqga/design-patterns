package command;

public class RemoteController {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        System.out.println("Pressing the button");
        this.command.execute();
    }

}
