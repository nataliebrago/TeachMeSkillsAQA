import employees.Accountant;
import employees.Director;
import employees.Employee;
import employees.Worker;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // doShapeTask();
        doEmployeesTask();
      }

      private static void doShapeTask(){
          Shape[] array = {
                  new Circle("Circle", 10),
                  new Circle("Circle", 20),
                  new Triangle("Triangle", 10,5,12),
                  new Triangle("Triangle", 11,15,5),
                  new Rectangle("Rectangle", 44, 12)
          };

          System.out.printf("All shapes perimeter =  " + calculatePerimeterForAllShapes(array));
      }

      private static double calculatePerimeterForAllShapes(Shape[] mShapesArray){
        double perimeter = 0;
        for(int i = 0; i < mShapesArray.length; i++) {
            perimeter = perimeter + mShapesArray[i].calculatePerimeter();
        }
        return perimeter;
      }


    private static void doEmployeesTask(){

        Employee mWorker = new Worker();
        System.out.println("Employee position is : " + mWorker.getEmployeePosition());

        Employee mAccountant = new Accountant();
        System.out.println("Employee position is : " + mAccountant.getEmployeePosition());

        Employee mDirector = new Director();
        System.out.println("Employee position is : " + mDirector.getEmployeePosition());
    }

}