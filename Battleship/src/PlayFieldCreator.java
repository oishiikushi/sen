public class PlayFieldCreator {
	public static int [][] createPlayField() {
		int[][] field = new int[7][7];
		field[0][0] = 1;
		field[0][1] = 1;
		field[0][2] = 1;
		field[0][3] = 1;
		field[0][4] = 1;
		field[0][5] = 0;
		field[0][6] = 0;
		field[1][0] = 1;
		field[1][1] = 1;
		field[1][2] = 1;
		field[1][3] = 1;
		field[1][4] = 0;
		field[1][5] = 0;
		field[1][6] = 0;
		field[2][0] = 1;
		field[2][1] = 1;
		field[2][2] = 1;
		field[2][3] = 0;
		field[2][4] = 0;
		field[2][5] = 0;
		field[2][6] = 0;
		field[3][0] = 1;
		field[3][1] = 1;
		field[3][2] = 0;
		field[3][3] = 0;
		field[3][4] = 0;
		field[3][5] = 0;
		field[3][6] = 0;
		field[4][0] = 0;
		field[4][1] = 0;
		field[4][2] = 0;
		field[4][3] = 0;
		field[4][4] = 0;
		field[4][5] = 0;
		field[4][6] = 0;
		return field;
	}
}
