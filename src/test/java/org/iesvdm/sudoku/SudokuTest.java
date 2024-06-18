package org.iesvdm.sudoku;

// Se importan los tests de junit, los asserts y los assertions.
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Se crea la clase para hacer los tests necesarios para el sudoku.
public class SudokuTest {

    @Test
    void failTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardBasedInCluesRandomlySolvable();
        sudoku.printBoard();
    }

    /*
    Le hacemos un test al metodo fillBoardRandomly
    para verificar que los numeros randoms esten entre 1 y 9.
    */
    @Test
    void fillBoardRandomlyTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardRandomly();
        sudoku.printBoard();

        for (int i = 0; i < sudoku.getGridSize(); i++) {
            for (int j = 0; j < sudoku.getGridSize(); j++) {

            }
        }
    }

    /*
    Le hacemos un test al metodo fillBoardBasedInCluesRandomly
    para verificar que las pistas esten comprendidas entre 0 y 9
    y que se cumpla la cantidad de pistas.
    */
    @Test
    void fillBoardBasedInCluesRandomly() {
        Sudoku sudoku = new Sudoku();
        // Creamos una matriz de 9x9.
        int[][] board = new int[9][9];
        // Iniciamos un contador para las pistas.
        int count = 0;
        // Añadimos una cantidad de pistas.
        int numClues = 40;

        // Seteamos la tabla.
        sudoku.setBoard(board);
        // Seteamos los numeros de pistas.
        sudoku.setNumClues(numClues);
        // Rellenamos la matriz.
        sudoku.fillBoardBasedInCluesRandomly();

        // Creamos un bucle para que recorra el array verticalmente.
        for (int i = 0; i < 9; i++) {
            // Creamos un bucle para que recorra el array horizontalmente.
            for (int j = 0; j < 9; j++) {
                //Establecemos una condicion para comprobar que el numero este comprendido entre 1 y 9.
                if (board[i][j] != 0) {
                    // Realizamos el assertion para verificar que este dentro del rango entre 1 y 9.
                    assertThat(count).isBetween(1, 9);
                } // if
            } // for (j)
        } // for (i)
        // Realizamos el assertion para contar los numeros de pistas.
        assertThat(count).isEqualTo(numClues);
    }

    /*
    Le hacemos un test al metodo fillBoardBasedInCluesRandomlySolvable
    para verificar que se pase correctamente la solucion.
    */
    @Test
    void fillBoardBasedInCluesRandomlySolvable() {
        Sudoku sudoku = new Sudoku();
        // Creamos una matriz de 9x9.
        int[][] board = new int[9][9];

        // Seteamos la tabla.
        sudoku.setBoard(board);
        // Rellenamos la tabla ya solucionada.
        sudoku.fillBoardBasedInCluesRandomlySolvable();
        // Realizamos el assertion para verificar que sea solucionable.
        assertThat(sudoku.solveBoard()).isEqualTo(true);

    }

    /*
    Le hacemos un test al metodo fillBoardSolvable
    para verificar si la solucion que plantea, es correcta.
    */
    @Test
    void fillBoardSolvable() {
        Sudoku sudoku = new Sudoku();
        // Creamos una matriz de 9x9.
        int[][] board = new int[9][9];

        // Seteamos la tabla.
        sudoku.setBoard(board);
        // Rellenamos la tabla
        sudoku.fillBoardSolvable();

    }

    /*
    Le hacemos un test al metodo isNumberInRow
    para verificar que recorre todas las filas.
    */
    @Test
    void isNumberInRowTest() {
        Sudoku sudoku = new Sudoku();
        // Creamos una matriz de 9x9.
        int[][] board = new int[9][9];

    }

    /*
    Le hacemos un test al metodo isNumberInColumn
    para verificar que recorre todas las columnas.
    */
    @Test
    void isNumberInColumnTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.isNumberInColumn(0, 8);
        sudoku.printBoard();

    }

    /*
    Le hacemos un test al metodo isNumberInBox
    para verificar que recorra todas las cajas correctamente.
    */
    @Test
    void isNumberInBoxTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.isNumberInBox(0, 0, 8);
        sudoku.printBoard();

    }

    /*
    Le hacemos un test al metodo solveBoard
    para verificar que la solucion es valida en el caso de que haya.
    */
    @Test
    void solveBoardTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.solveBoard();
        sudoku.printBoard();

        for (int row = 0; row < sudoku.getGridSize(); row++) {
            for (int column = 0; column < sudoku.getGridSize(); column++) {
                
            }
        }
    }
}
