import java.util.Scanner;

public class advancedCalculator{

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Have many numbers you will enter :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Have many numbers you will enter :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can not enter 0 for divisive");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number :");
        int base = scan.nextInt();
        System.out.print("Enter the power number :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }
    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first = input.nextInt();
        System.out.println("Enter the second number : ");
        int second = input.nextInt();

        int result = first % second ;

        System.out.println("Result : " + result);
    }

    static void arcur() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first edge : ");
        int edge1 = input.nextInt();

        System.out.println("Enter the second edge : ");
        int edge2 = input.nextInt();

        int area = edge1 * edge2;
        int cur = (edge1 + edge2) * 2;

        System.out.println("Area of your rectangle is : " + area);
        System.out.println("Circumference of your rectangle is : " + cur);



    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Extraction \n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential Number Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Modding\n"
                + "8- Area and Circumference of Rectangles\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Choose a process : ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;

                case 7:
                    mod();
                    break;

                case 8:
                    arcur();
                    break;

                    case 0:
                    break;
                default:
                    System.out.println("You have entered a wrong value try again. ");
            }
        } while (select != 0);


    }
}











