package Access;

class Circle
{
    private int radius;

    public void setRadius(int r)
    {
        if (r > 0)
        {
            radius = r;
        }
        else
        {
            System.out.println("Radius must be greater than 0!");
        }
    }

    public int getRadius()
    {
        return radius;
    }
}

public class CircleValidation
{
    public static void main(String[] args)
    {
        Circle myCircle = new Circle();

        myCircle.setRadius(5);
        System.out.println("The radius of the circle is: " + myCircle.getRadius());

        myCircle.setRadius(-3);
        System.out.println("The radius of the circle is still: " + myCircle.getRadius());
    }
}
