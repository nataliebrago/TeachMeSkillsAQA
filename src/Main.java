import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         //Create scanner object
         Scanner scanner = new Scanner(System.in);

         //Task1
         outputInfoAboutPeople(scanner);


         //Task2
         System.out.println("");
         System.out.println("Please enter a character: ");
         char character = scanner.next().charAt(0);
         outputCharAndCode(character);

         //Task3
         System.out.println("");
         System.out.println("Please enter your weight: ");
         float weight = scanner.nextFloat();

         System.out.println("Please enter your height: ");
         float height =  scanner.nextFloat();

         outputBMI(weight,height);
         scanner.close();
     }


     public static void outputInfoAboutPeople(Scanner scanner){

         System.out.println("Please enter your name: ");
         String name = scanner.nextLine();

         System.out.println("Please enter your surname: ");
         String surname = scanner.nextLine();

         System.out.println("Please enter your weight: ");
         float weight = scanner.nextFloat();

         System.out.println("Please enter your age: ");
         int age =  scanner.nextInt();

         System.out.println("Please enter your height: ");
         float height =  scanner.nextFloat();

         System.out.println("");
         System.out.println("Your name is:" + name );
         System.out.println("Your surname is:" + surname );
         System.out.println("Your weight is:" + weight );
         System.out.println("Your age is:" + age );
         System.out.println("Your height is:" + height );
     }

     public static void outputCharAndCode(char character){
         int characterInt = character;
         System.out.println("Character is :" +  character + " - " + characterInt);
    }

    public static void outputBMI(float weight, float height){
         double bmi = weight / ( (height /100) * (height /100));
         System.out.println("BMI is :" +  bmi + " kg/m2");

    }

}
