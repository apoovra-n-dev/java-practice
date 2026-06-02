import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        char choice = '+';

        Scanner sc = new Scanner(System.in);

        switch(choice)
        {
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

            default:
                System.out.println("no such Expression");
        }
    }
}