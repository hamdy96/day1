import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {
    private static Logger log;
    private static ResourceBundle resourceBundle;

    public static void main(String[]args){
        log = Logger.getLogger(MainClass.class.getName());
        resourceBundle = ResourceBundle.getBundle("Profile");
        log.setLevel(Level.ALL);

        String profileName = resourceBundle.getString("profileNameRes");

        if(profileName.equals("1")){
            log.info("Hello World from Profile 1");
        }
        else if (profileName.equals("2")) {
            log.info("Hello World from Profile 2");
        }
    }
}