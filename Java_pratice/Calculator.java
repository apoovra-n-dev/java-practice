class Calculator
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int choice = '+';

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
            
        }
    }
}