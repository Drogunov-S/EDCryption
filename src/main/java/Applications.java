import controllers.MainController;
import enity.Result;
import exceptions.AppExceptions;
import java.util.Arrays;

public class Applications {
    private final MainController mainController;

    public Applications() {
        mainController = new MainController();
    }


    public Result run(String[] args) {
        if(args.length > 0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            return mainController.doAction(action, parameters);
        }
        throw new AppExceptions();


    }
}
