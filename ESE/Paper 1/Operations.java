import java.util.*;

interface Calculator
{
    double sum(double x, double y);

    double difference(double x, double y);
    
    double product(double x, double y);

    double remainder(double x, double y);
}

public class Operations implements Calculator
{
    public double sum(double x, double y)
    {
        return x + y;
    }

    public double difference(double x, double y)
    {
        return x - y;
    }

    public double product(double x, double y)
    {
        return x * y;
    }

    public double remainder(double x, double y)
    {
        return x % y; 
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int choice;

        Operations c = new Operations();

        do
        {
            System.out.println("Enter your choice. \n1.Calculate Sum. \n2.Calculate Difference. \n3.Calculate Product. \n4.Calculate Reaminder. \n5.Exit.");
            
            choice = s.nextInt();

            switch (choice)
            {
                case 1:
                System.out.println(c.sum(10,5));
                break;

                case 2:
                System.out.println(c.difference(10,5));
                break;

                case 3:
                System.out.println(c.product(10,5));
                break;

                case 4:
                System.out.println(c.remainder(15,8));
                break;

                case 5:
                return;

                default:
                System.out.println("Please enter the correct choice.");
                break;
            }
        }while(choice != -1);
        s.close();
    }
}