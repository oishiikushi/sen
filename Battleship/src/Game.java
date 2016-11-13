
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MultiHashtable;

import java.util.*;

public class Game {

    private int[][]  playfield;
    private String[] kiMoves;
    private int      round = 0;
    private int      hitsPlayer = 0;
    private int      hitsComputer = 0;
    private boolean  running = true;
    private boolean  playerTurn = true;
    private Scanner  in = new Scanner(System.in);
    Map<String, Integer> coords = new HashMap<String, Integer>();

    public Game(int[][] playfield) {

        this.playfield = playfield;
        kiMoves = KICreator.createKIMoves();
        coords.put("A", 1);
        coords.put("B", 2);
        coords.put("C", 3);
        coords.put("D", 4);
        coords.put("E", 5);
        coords.put("F", 6);
        coords.put("G", 7);
    }

    public void play() {
        System.out.println("Schiffeversenken gestartet...");

        while (running) {

            if (playerTurn) {
                round++;
                turnPlayer();
            }
            else
                turnComputer();

            playerTurn =! playerTurn;
        }
    }

    private void turnPlayer() {
        System.out.println("Gib Deine Schusskoordinaten in Form <Zeile><Spalte> ein:");

        String[] shot = in.nextLine().split("");
        while (!coords.containsKey(shot[0]) || !coords.containsValue(Integer.parseInt(shot[1]))) {
            System.out.println("Bitte gültige Schusskoordinaten Eingeben <A-G><1-7>!");
            shot = in.nextLine().split("");
        }

        int row = coords.get(shot[0]) - 1;
        int column = Integer.parseInt(shot[1]) - 1;

        if (playfield[row][column] == 1) {
            System.out.println("Treffer");
            hitsPlayer++;

            if (hitsPlayer == 14) {
                System.out.println("Du hast das Spiel nach Abgabe von "+ round +" Schüssen gewonnen.");
                running = false;
            }
        }
        else {
            System.out.println("Daneben");
        }
    }

    private void turnComputer() {

        System.out.println(
                "Der Computer feuert bei dir auf die Koordinaten "+ kiMoves[round - 1] +". War das ein Treffer? (j/n)"
        );

        String awnser = in.nextLine();
        while (!awnser.equals("j") && !awnser.equals("n")) {
            System.out.println("Bitte nur 'j' oder 'n' eingeben.");
            awnser = in.nextLine();
        }

        if (awnser.equals("j")) {
            hitsComputer++;
            if (hitsComputer == 14) {
                System.out.println("Der Computer hat das Spiel nach Abgabe von "+ round +" Schüssen gewonnen.");
                running = false;
            }
        }

        if (awnser.equals("n")) {
            return; // just next round atm
        }
    }
}
