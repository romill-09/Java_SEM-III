public class Shape {
    double d;
    Shape(double d) {
        this.d = d;
    }

    public static void main(String args[])
    {
        Circle c = new Circle(5);
        System.out.println("Area of the circle is " + c.area());
        System.out.println("Circumference of the circle is " + c.circumference());
        
        Square sq = new Square(5);
        System.out.println("Area of the square is " + sq.area());
        System.out.println("Length of diagonal is " + sq.diagonalLength());
        
        Sphere s = new Sphere(5);
        System.out.println("Volume of the circle is " + s.Volume());
        System.out.println("Surface Area of the circle is " + s.surfaceArea());
    }
}

class Circle extends Shape
{
    Circle(double d)
    {
        super(d);
    }

    double area()
    {
        return 3.14 * d * d;
    }
    
    double circumference()
    {
        return 6.28 * d;
    }
}

class Square extends Shape
{
    Square(double d)
    {
        super(d);
    }

    double area()
    {
        return d * d;
    }
    
    double diagonalLength()
    {
        return 1.414 * d;
    }
}

class Sphere extends Shape
{
    Sphere(double d)
    {
        super(d);
    }

    double Volume()
    {
        return 4/3*3.14 * d * d * d;
    }
    
    double surfaceArea()
    {
        return 4 * 3.14 * d * d;
    }
}