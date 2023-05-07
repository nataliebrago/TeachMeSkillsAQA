import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         //Create scanner object
         Scanner enter = new Scanner(System.in);
         //Task1
         doTask1(enter);

         //Task2
         System.out.println("");
         System.out.println("Please enter a character: ");
         char character = enter.next().charAt(0);
         doTask2(character);

         //Task3
         System.out.println("");
         System.out.println("Please enter your weight: ");
         float weight = enter.nextFloat();

         System.out.println("Please enter your height: ");
         float height =  enter.nextFloat();

         doTask3(weight,height);
         enter.close();
     }


     public static void doTask1( Scanner enter){

         System.out.println("Please enter your name: ");
         String name = enter.nextLine();

         System.out.println("Please enter your surname: ");
         String surname = enter.nextLine();

         System.out.println("Please enter your weight: ");
         float weight = enter.nextFloat();

         System.out.println("Please enter your age: ");
         int age =  enter.nextInt();

         System.out.println("Please enter your height: ");
         float height =  enter.nextFloat();

         System.out.println("");
         System.out.println("Your name is:" + name );
         System.out.println("Your surname is:" + surname );
         System.out.println("Your weight is:" + weight );
         System.out.println("Your age is:" + age );
         System.out.println("Your height is:" + height );
     }

     public static void doTask2(char character){
         int characterInt =  (int) character;
         System.out.println("Character is :" +  character + " - " + characterInt);
    }

    public static void doTask3(float weight, float height){

         float bmi = weight / ( (height /100) * (height /100));
         System.out.println("BMI is :" +  bmi + " kg/m2");

    }

}
