
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MultiHashtable;

import java.util.*;

/**
 * Created by FyahMayah on 15.10.16.
 */
public class Game {
    private int[][] playfield;
    private int round;
    private int hits;
    private boolean running;

    public Game(int[][] playfield) {
        this.playfield = playfield;
        this.running = true;
        this.round = 1;
        this.hits = 0;
    }

    public void play() {
        System.out.println("Schiffeversenken gestartet...");

        Map<String, Integer> coords = new HashMap<String, Integer>();
        coords.put("A",1);
        coords.put("B",2);
        coords.put("C",3);
        coords.put("D",4);
        coords.put("E",5);
        coords.put("F",6);
        coords.put("G",7);
        Scanner in = new Scanner(System.in);
        String[] shot;

        while (running) {
            System.out.println("Gib Deine Schusskoordinaten in Form <Zeile><Spalte> ein:");

            shot = in.nextLine().split("");

            if (coords.containsKey(shot[0]) && coords.containsValue(Integer.parseInt(shot[1]))) {
                int row = coords.get(shot[0]) - 1;
                int column = Integer.parseInt(shot[1]) - 1;

                if (playfield[row][column] == 1) {
                    System.out.println( "Treffer");
                    hits++;
                }
                else {
                    System.out.println( "Daneben");
                }
            }
            else {
                System.out.println("Bitte gültige Schusskoordinaten Eingeben <A-G><1-7>!");
            }

            if (hits == 15) {
                running = false;
            }
            else {
                round++;
            }
        }

        System.out.println("Du hast das Spiel nach Abgabe von "+round+" Schüssen gewonnen.");
    }
}
