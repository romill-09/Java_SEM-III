import java.util.*;
class Item {
    String name;
    int price;
    int quantity;

    Item(String n, int p, int q)
    {
        name = n;
        price = p;
        quantity = q;
    }

    public String toString()
    {
        return("Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity);
    }
}

public class Shopping {
    public static void main(String args[])
    {
        Vector<Item> v = new Vector<Item> ();
        Scanner s = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Enter your choice\n 1.Remove element by name \n");
            choice = s.nextInt();
            switch(choice)
            {
                case 1:
                    String n;
                    System.out.println("Enter name to delete");
                    s.nextLine();
                    n = s.nextLine();
                    for(int i = 0; i < v.size(); i++)
                    {
                        if(v.get(i).name.equals(n))
                        {
                            v.remove(i);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter name of the product, price and quantity");
                    s.nextLine();
                    String n4 = s.nextLine();
                    int p4 = s.nextInt();
                    int q4 = s.nextInt();

                    Item i = new Item(n4, p4, q4);

                    v.add(i);
                    break;
                
                case 3:
                    System.out.println("Enter name of the product, price and quantity");
                    s.nextLine();
                    String n2 = s.nextLine();
                    int p2 = s.nextInt();
                    int q2 = s.nextInt();

                    Item i2 = new Item(n2, p2, q2);

                    System.out.println("Enter the index to insert at");
                    int ind = s.nextInt();

                    v.add(ind, i2);
                    break;
                    
                case 4:
                    Enumeration<Item> e = v.elements();
                    
                    while(e.hasMoreElements())
                    {
                        System.out.println(e.nextElement());
                    }
                    break;
                    
                case 5:
                    return;

                default:
                    System.out.println("Enter the correct choice.");
                    break;
            }
        }
        while(choice != -1);

    }
}