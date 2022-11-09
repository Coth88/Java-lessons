import java.lang.reflect.Array;

public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
        char[][] charArray = new char[size][size];
        /*[0,0][0,1][0,2][0,3][0,4]
          [1,0][1,1][1,2][1,3][1,4]
          [2,0][2,1][2,2][2,3][2,4]
          [3,0][3,1][3,2][3,3][3,4]
          [4,0][4,1][4,2][4,3][4,4]
         */

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++){
                if (i == j || i + j == (size -1)) {
                    charArray[i][j] = symbol;
                }
                else {
                    charArray[i][j] = ' ';
                }
                System.out.print(charArray[i][j]);
            }
            System.out.println();
        }




        return  charArray;

        //return new char[0][0];
    }
}
