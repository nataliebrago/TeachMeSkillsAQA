import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        outputThreeMulArray(scan);
        outputChessBoard();
        sumArray();  //дополнительное 2
        outputDiagonal();
        scan.close();
    }


    public static void outputThreeMulArray (Scanner scan) {
        System.out.print("Enter increment value : ");
        int a = scan.nextInt();

        //3-мерный массив
        int[][][] threeMulArray = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {21, 22, 23,},
                        {24},
                        {25, 26}
                }
        };

        System.out.println("Default array : ");
        for (int i = 0; i < threeMulArray.length; i++) {
            for (int j = 0; j < threeMulArray[i].length; j++) {
                for (int k = 0; k < threeMulArray[i][j].length; k++) {
                    System.out.print(threeMulArray[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Increment array : ");
        for (int i = 0; i < threeMulArray.length; i++) {
            for (int j = 0; j < threeMulArray[i].length; j++) {
                for (int k = 0; k < threeMulArray[i][j].length; k++) {
                    threeMulArray[i][j][k] = threeMulArray[i][j][k] + a;
                    System.out.print(threeMulArray[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void outputChessBoard () {
        System.out.print("Chess Board Array : \n\n");

        //2-мерный массив
        String[][] chessBoardArray = new String[8][8];
        for (int i = 0; i < chessBoardArray.length; i++) {
            for (int j = 0; j < chessBoardArray[i].length; j++) {
                if (i % 2d == 0) {
                    if (j % 2d == 0) {
                        chessBoardArray[i][j] = "W";
                        System.out.print(chessBoardArray[i][j] + " ");
                    } else {
                        chessBoardArray[i][j] = "B";
                        System.out.print(chessBoardArray[i][j] + " ");
                    }
                } else {
                    if (j % 2d == 0) {
                        chessBoardArray[i][j] = "B";
                        System.out.print(chessBoardArray[i][j] + " ");
                    } else {
                        chessBoardArray[i][j] = "W";
                        System.out.print(chessBoardArray[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sumArray(){
        int sum = 0;
        //2-мерный массив
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
         }
        System.out.print("Sum elements in array : " + sum + "\n");
    }

    public static void outputDiagonal() {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.print("\nMain Diagonal array : \n");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.print("Side Diagonal array : \n");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i][array.length-1 - i] + " ");
        }
        System.out.println();
    }
}


