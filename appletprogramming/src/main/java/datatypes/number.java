package datatypes;

import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        System.out.println("You entered: " + number);
    }
}