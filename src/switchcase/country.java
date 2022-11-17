package switchcase;

import java.util.Scanner;

public class country {

    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int x = pc.nextInt();
        switch (x) {
            case 1:
                System.out.println("MUMBAI");
                break;

            case 2:
                System.out.println("DELHI");
                break;

            case 3:
                System.out.println("HARYANA");
                break;

            case 4:
                System.out.println("Chennai");
                break;

            case 5:
                System.out.println("Bangalore");
                break;

            case 6:
                System.out.println("Hyderabad");
                break;

            case 7:
                System.out.println("Ahemdabad");
                break;
        }

    }
}