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
                if (i >= 7) break;

                int j = 0;
                String[] row = line.split("");
                for(String entry : row) {
                    if (j >= 7) break;

                    code += "\t\tfield["+i+"]["+j+"] = " + entry + ";\n";
                    j++;
                }
                i++;
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
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
