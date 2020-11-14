package doWhileLoop;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        //this is a program to prompt a user to continue or pass using the do while loop
        int programCounter;
        do {
            int sum=0;
            int list[] = new int[3];
            Scanner in = new Scanner(System.in);
            System.out.println("Enter  3 numbers to be added: ");
            for (int i = 0; i < 3; i++) {
                list[i] = in.nextInt();
                sum+= list[i];
            }
            System.out.println("sum = "+ sum);

            System.out.println("Enter 1 to continue or any value to exit........");
            programCounter = in.nextInt();

        }
        while (programCounter == 1);

    }
}
