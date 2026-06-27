
import java.util.Scanner;


public class Input {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = sc.nextInt(); // nextInt for take input of integer
        System.out.println("Enter Second number:");
        int b = sc.nextInt();

        System.out.println("Sum of these two number is "+ (a + b));

        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Your name is "+ name );

        System.out.println("Hello user..");
        System.out.println("Enter your age here : ");
        int age = sc.nextInt();
        sc.nextLine(); // This is for nextLine to take enter command and clear the buffer
        System.out.println("Enter your name here : ");
        String name1 = sc.nextLine();

        System.out.println(name1+ " your age is "+ age);



    }
}
