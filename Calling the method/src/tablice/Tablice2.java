package tablice;

import java.util.Arrays;

public class Tablice2 {

    private Integer[][] board;

    public Tablice2(Integer[][] board) {
        this.board = board;
    }

    public static Tablice2 sudoku() {
        Integer[][] board = new Integer[][] {
                new Integer[] {5, 3, null, null, 7, null, null, null, null},
                new Integer[] {6, null, null, 1, 9, 5, null, null, null},
                new Integer[] {null, 9, 8, null, null, null, null, 6, null},

                new Integer[] {8, null, null, null, 6, null, null, null, 3},
                new Integer[] {4, null, null, 8, null, 3, null, null, 1},
                new Integer[] {7, null, null, null, 2, null, null, null, 6},

                new Integer[] {null, 6, null, null, null, null, 2, 8, null},
                new Integer[] {null, null, null, 4, 1, 9, null, null, 5},
                new Integer[] {null, null, null, null, 8, null, null, 7, 9}
        };
        return new Tablice2(board);
    }

    public static void main(String[] args) {
        Tablice2 sudokuGame = new Tablice2(sudoku().board); //lub Tablice2 sudokuGame = sudoku(), lub wcale nie pisac tylko w linice nizej podac od razu adres bez tworzenia instancji
        System.out.println(Arrays.deepToString(sudokuGame.board));
    }

}
