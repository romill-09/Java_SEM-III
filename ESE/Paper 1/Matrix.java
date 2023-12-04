import java.util.*;

interface Mat {
    void read();
    void display();
}

public class Matrix implements Mat{

    int arr[][] = new int[3][3];
    Scanner s = new Scanner(System.in);
    public static void main(String args[])
    {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        m1.read();
        m2.read();

        System.out.println("Matrix 1");
        m1.display();
        System.out.println("Matrix 2");
        m2.display();

        System.out.println("Matrix Added");
        MatrixOp mo = new MatrixOp();
        mo.add(m1,m2);
        mo.display();
    }

    public void read()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
    }

    public void display()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MatrixOp extends Matrix {

    void add (Matrix m1, Matrix m2)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                this.arr[i][j] = m1.arr[i][j] + m2.arr[i][j];
            }
        }
    }
}

class MatrixSearch extends Matrix {

    Boolean add (int data, Matrix m)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(arr[i][j] == data)
                {
                    return true;
                }
            }
        }
        return false;
    }
}