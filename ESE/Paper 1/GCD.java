class Hue {
    static int gcd(int a, int b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}

public class GCD {
    public static void main(String[] args)
    {
        int larger = 9;
        int smaller = 6;
        System.out.println("GCD is " + Hue.gcd(larger, smaller));
        System.out.println("LCM is " + (larger * smaller)/(Hue.gcd(larger, smaller)));
    }
}