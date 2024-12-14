import java.util.Scanner;

public class Calculator
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        close:while (true)
        {
            System.out.println("1. Addition \n 2. Subtraction \n 3. Multiplaction \n 4.Division \n 5. Exit");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("1 for two no addition \n 2 for three no addition");
                    int n =sc.nextInt();
                    if (n==1)
                    {
                        System.out.println("Enter 2 no:");
                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        double rt1 = Calc.add(a , b);
                        System.out.println(rt1);
                    }
                    else if (n==2)
                    {
                        System.out.println("Enter 3 no:");
                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        double c = sc.nextDouble();
                        double rt1 = Calc.add(a , b, c);
                        System.out.println(rt1);
                    }
                    break;

                case 2:
                    System.out.println("1 for two no subtraction \n 2 for three no subtraction");
                    int m =sc.nextInt();
                    if (m==1)
                    {
                        System.out.println("Enter 2 no:");
                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        double rt1 = Calc.sub(a , b);
                        System.out.println(rt1);
                    }
                    else if (m==2)
                    {
                        System.out.println("Enter 3 no:");
                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        double c = sc.nextDouble();
                        double rt1 = Calc.sub(a , b, c);
                        System.out.println(rt1);
                    }
                    break;

                case 3:
                    System.out.println("1 for two no multiple  \n 2 for three no multiple");
                    int o =sc.nextInt();
                    if (o==1)
                    {
                        System.out.println("Enter 2 no:");
                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        double rt1 = Calc.mul(a , b);
                        System.out.println(rt1);
                    }
                    else if (o==2)
                    {
                        System.out.println("Enter 3 no:");
                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        double c = sc.nextDouble();
                        double rt1 = Calc.mul(a , b, c);
                        System.out.println(rt1);
                    }
                    break;

                case 4:
                    System.out.println("Enter");
                    double h = sc.nextDouble();
                    double i = sc.nextDouble();
                    double rt4 = Calc.div(h , i);
                    System.out.println(rt4);
                    break;

                case 5:
                    break close;
            }
        }
    }

}

