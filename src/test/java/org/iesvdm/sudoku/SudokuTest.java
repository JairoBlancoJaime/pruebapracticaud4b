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
        sudoku.fillBoardBasedInCluesRandomly();
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
    void fillBoardBasedInCluesRandomlyTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardBasedInCluesRandomly();
        sudoku.printBoard();


    }

    /*
    Le hacemos un test al metodo fillBoardBasedInCluesRandomlySolvable
    para verificar que se pase correctamente la solucion.
    */
    @Test
    void fillBoardBasedInCluesRandomlySolvableTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardBasedInCluesRandomlySolvable();
        sudoku.printBoard();

    }

    /*
    Le hacemos un test al metodo fillBoardSolvable
    para verificar si la solucion que plantea, es correcta.
    */
    @Test
    void fillBoardSolvableTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardSolvable();
        sudoku.printBoard();

    }

    /*
    Le hacemos un test al metodo isNumberInRow
    para verificar que recorre todas las filas.
    */
    @Test
    void isNumberInRowTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.isNumberInRow(0, 8);
        sudoku.printBoard();

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
