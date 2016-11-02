import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // create class code
        String code = "public class PlayFieldCreator {\n" +
                "\tpublic static int [][] createPlayField() {\n" +
                "\t\tint[][] field = new int[7][7];\n";

        int[][] field = new int[7][7];

        // generate code dependent on file content
        try {
            BufferedReader in = new BufferedReader(new FileReader("playfield.txt"));

            int i = 0;
            String line;
            while ((line = in.readLine()) != null) {
                if(line.length() != 7) {
                    throw new IOException("Das Spielfeld enthält eine Zeile mit nicht genau 7, sondern " + line.length() + " Spalten");
                }

                int j = 0;
                String[] row = line.split("");
                for(String entry : row) {
                    if (!entry.equals("0") && !entry.equals("1")) {
                        throw new IOException("Das Spielfeld enthält ungültige Zeichen: " + entry);
                    }
                    code += "\t\tfield["+i+"]["+j+"] = " + entry + ";\n";
                    j++;
                }
                i++;
            }
            if(i != 7) {
                throw new IOException("Das Spielfelds enthält nicht genau 7, sondern " + i + " Zeilen");
            }
            in.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        // finish class code
        code += "\t\treturn field;\n\t}\n}\n";

        // write code to a .java file
        try {
            FileWriter out = new FileWriter("../Battleship/src/PlayFieldCreator.java", false);
            out.write(code);
            out.close();
            System.out.println("PlayFieldCreator.java wurde erstellt");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
