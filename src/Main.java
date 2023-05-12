import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputFigure = new Scanner(System.in);
        outputTimesOfTheYear(inputFigure);
        outputTimesOfTheYearSwitch(inputFigure);
        checkOddNumber(inputFigure);
        outputTemp(inputFigure);
        defineColor(inputFigure);
        outputOddNumbers ();
        outputNumbersWithDecrement();
        enterPositiveNumber(inputFigure);
        outputNumbersInDefinedSequence();
        outputTenNumbers();
        outputSquaresOfTheNumbers();
        outputTenOfTheFibonacciNumbers();
        inputFigure.close();
    }

    public static void outputTimesOfTheYearSwitch(Scanner inputFigure) {
        System.out.println("Enter the names of the time of the year by the month number: ");

        int i = inputFigure.nextInt();
        switch (i) {
            case 9, 10, 11: {
                System.out.println("Autumn");
                //  break;
            }
            case 12, 1, 2: {
                System.out.println("Winter");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Spring");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Summer");
                break;
            }
            default: {
                System.out.println("Sorry! But you entered incorrect information. Try again, please.");
            }
        }
        System.out.println();
    }

    public static void outputTimesOfTheYear(Scanner inputFigure) {
        System.out.println("Enter the names of the time of the year by the month number: ");

        int i = inputFigure.nextInt();
        if (i == 9 || i == 10 || i == 11) {
            System.out.println("It's Autumn");
        } else if (i == 1 || i == 2 || i == 12) {
            System.out.println("It's Winter");
        } else if (i == 3 || i == 4 || i == 5) {
            System.out.println("It's Spring");
        } else if (i == 06 || i == 7 || i == 8) {
            System.out.println("It's Summer");
        } else {
            System.out.println("Sorry! But you entered incorrect information. Try again, please.");
        }
        System.out.println();
    }

    public static void checkOddNumber(Scanner inputFigure) {
        System.out.println("Enter a number: ");
        int i = inputFigure.nextInt();
        {
            if (i % 2 != 0) {
                System.out.println("It's an odd number = " + i);
            } else if (i % 2 == 0)
                System.out.println("It's an even number = " + i);
        }
        System.out.println();
    }

    public static void outputTemp(Scanner inputFigure) {
        System.out.println("Enter a temperature: ");
        int t = inputFigure.nextInt();
        {
            if (t > -5) {
                System.out.println("It's a warm day " + t);
            } else if (-5 >= t && t > -20) {
                System.out.println("It's a normal day " + t);
            } else if (-20 >= t) {
                System.out.println("It's a cold day " + t);
            }
        }
        System.out.println();
    }

    public static void defineColor(Scanner inputFigure) {
        System.out.println("Define the color of the rainbow by the entered number: ");
        int i = inputFigure.nextInt();
        if (i == 1) {
            System.out.println("red");
        } else if (i == 2) {
            System.out.println("green");
        } else if (i == 3) {
            System.out.println("blue");
        } else if (i == 4) {
            System.out.println("orange");
        } else if (i == 5) {
            System.out.println("yellow");
        } else if (i == 6) {
            System.out.println("indigo");
        } else {
            System.out.println("Sorry! But you entered incorrect information. Try again, please.");
        }
        System.out.println();
    }

    public static void outputOddNumbers() {
        System.out.print("OddNumbers : ");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void outputNumbersWithDecrement() {
        System.out.print("Numbers with decrement: ");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void enterPositiveNumber(Scanner inputFigure) {
        System.out.println("Enter a number: ");
        int n = inputFigure.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of sequences input number = " + sum);
        System.out.println("");
    }

    public static void outputNumbersInDefinedSequence() {
        System.out.print("Numbers in defined sequence: ");
        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println("");
        System.out.println("");
    }


    public static void outputTenNumbers() {
        System.out.print("Numbers sequences with subtraction -5: ");
        int number = 0;
        for (int i = 0; i < 10 ; i++) {
            System.out.print(number + " ");
            number = number -5;
        }
        System.out.println("");
        System.out.println("");
    }

    public static void outputSquaresOfTheNumbers() {
        System.out.print("Squares of the numbers: ");
        for (int i=10; i<=20; ++i){
            System.out.print (i*i + " ");
        }
        System.out.println("");
        System.out.println("");
    }


    public static void outputTenOfTheFibonacciNumbers(){
        int number1 = 1;
        int number2 = 1;
        int sum;
        System.out.print("Ten of the Fibonacci numbers: ");
        System.out.print(number1+" "+number2+" ");
        for(int i = 0; i <= 8; i++){
            sum = number1 + number2;
            System.out.print(sum+" ");
            number1 = number2;
            number2 = sum;
        }
        System.out.println();
    }
}
