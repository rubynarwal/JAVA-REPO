package calculator;
import java.util.Scanner;
public class percentage {
  public static void main(String[] args)  {
      System.out.println("calculator  percentage ");

      Scanner ac= new Scanner(System.in);
      System.out.println("percentage of eng");
      float eng=ac.nextFloat();
      System.out.println("percentage of hindi");
      float hindi=ac.nextFloat();
      System.out.println("percentage of Maths");
      float Maths=ac.nextFloat();
      System.out.println("percentage of Science");
      float Science=ac.nextFloat();
      System.out.println("percentage of Computer");
      float Computer=ac.nextFloat();
      int total=500;
      System.out.println("total percentage");
      float marks =(eng+hindi+Maths+Science);
      System.out.println(marks/total*100);





  }
}
