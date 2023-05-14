import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        outputTheSpecifiedNumber(scan);
        deleteAllOccurrencesOfTheSpecifiedNumbers (scan);
        outputMinMaxAvrRandomValues(scan);
        outputTheMaxMinAvgTwoArrays();
        scan.close();
    }


    public static void outputTheSpecifiedNumber (Scanner scan) {
        System.out.print("Enter search value in array : ");
        int a = scan.nextInt();
        int[] nums = new int[]{100, 24, 33, 41, 555, 62, 71, 81, 92, 1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == a) {
                System.out.println("Number entered array\n");
                return;
            }
        }
        System.out.println("Number not included array\n");
    }


    public static void deleteAllOccurrencesOfTheSpecifiedNumbers (Scanner scan) {
        System.out.print("Enter number for remove : ");
        int inputValueFromKeyboard = scan.nextInt();
        int[] nums = new int[]{13, 4, 55, 44, 33, 22, 11, 55, 33, 55};
        int[] nums2;
        int removesValues = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == inputValueFromKeyboard){
                removesValues++;
            }
        }
        if(removesValues == 0){
            System.out.println("This value not found in array");
        }
        else{
            System.out.print("New array without remove items : ");
            nums2 = new int[nums.length - removesValues];
            for(int i = 0, k = 0; i < nums.length; i++){
                if(nums[i] != inputValueFromKeyboard){
                    nums2[k] = nums[i];
                    System.out.print(" " + nums2[k]);
                    k++;
                }
            }
            System.out.println();
        }
    }


    public static void outputMinMaxAvrRandomValues(Scanner scan) {
        System.out.print("\nEnter  array  length: ");
        int length = scan.nextInt();
        int[] nums = new int[length];
        long sum = 0;
        double average;

        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) (Math.random()*65535) + 1;
        }
        System.out.print("Array: ");
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            System.out.print(" " + nums[i]);
        }
        average = (double )sum / nums.length;
        Arrays.sort(nums);
        System.out.println("");
        System.out.println("Min value in array : " + nums[0]);
        System.out.println("Max value in array : " + nums[nums.length-1]);
        System.out.println("Average value in array : " + average);
    }

    public static void outputTheMaxMinAvgTwoArrays() {
        int[] nums = new int[]{13, 4, 55, 44, 33};
        int[] nums2 = new int[]{3, 44, 123, 4, 1452};

        long sum = 0;
        long sum2 = 0;
        double average;
        double average2;


        System.out.print("\nArray one: ");
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            System.out.print(" " + nums[i]);
        }

        System.out.print("\nArray two: ");
        for(int i = 0; i < nums2.length; i++){
            sum2 += nums2[i];
            System.out.print(" " + nums2[i]);
        }

        average = (double )sum / nums.length;
        average2 = (double )sum2 / nums2.length;
        if(average == average2)
            System.out.println("\nAverage + " + average +  "  equals Average2 "+ average2);
        else if(average > average2)
            System.out.println("\nAverage " + average + "  > Average2 " + average2);
        else if(average < average2)
            System.out.println("\nAverage " + average + "  < Average2 " + average2);
    }
}

