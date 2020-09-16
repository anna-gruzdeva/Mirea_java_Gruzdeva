public class Circle {
    public double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public void Diameter( )
    {
        System.out.println("Diameter "+radius*2);
    }

    public static void main(String[] agr)
    {
        Circle circle1 = new Circle(5.0);
        System.out.println("Radius is " + circle1.getRadius());
        circle1.Diameter();
    }
}