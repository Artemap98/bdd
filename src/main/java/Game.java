public class Game {
    public int[][] CreateMatrix() {
        return new int[4][4];
    }

    public int[][] InitMatrix(int[][] createMatrix) {

        for (int i = 0; i < createMatrix.length; i++)
            for (int j = 0; j < createMatrix[i].length; j++)
                createMatrix[i][j] = 0;

        return createMatrix;
    }
}
