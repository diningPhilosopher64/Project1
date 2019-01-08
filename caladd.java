import java.util.Scanner;

public class caladd {


    public static void main(String[] args) {

        float a,b,res;
        char choice,ch;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("1. Add two numbers \n");
            System.out.println("2. Exit \n\n");
            System.out.println("Enter your choice :");

            choice = scanner.next().charAt(0);

            switch (choice)
            {
                case '1':   System.out.println("Enter two numbers");
                            a = scanner.nextFloat();
                            b = scanner.nextFloat();
                            res = a + b;
                            System.out.println("Result is " + res);
                            break;

                case '2' : System.exit(0);
                           break;


                default:   System.out.println("Invalid Choice");
                           break;
            }

            System.out.println("\n --------------- \n");


        }while (choice != 2);

    }
}
