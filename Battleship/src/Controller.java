import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by FyahMayah on 15.10.16.
 */
public class Controller {

    private Game game;

    public Controller(){
        game = new Game(PlayFieldCreator.createPlayField());
        game.play();
    }

    public static void main (String[] args){
        new Controller();
    }
}
