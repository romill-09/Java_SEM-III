class NineException extends Exception {
    String m = "Error: Number contains Digit 9";
    public String toString()
    {
        return m;
    }
}

public class MyException {
    public static void main(String args[]) throws NineException
    {
        int n = 128893;
        while(n > 0)
        {
            int x = n % 10;
            try {
                if(x == 9)
                {
                    throw new NineException();
                }
            }
            catch (NineException e)
            {
                System.out.println(e);
            }
            
            n /= 10;
            
        }
        
    }
}