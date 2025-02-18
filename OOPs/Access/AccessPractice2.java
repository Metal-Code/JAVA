package Access;

class rectangle
{
    private int length;
    private int breadth;

    public rectangle()
    {
        length = 10;
        breadth = 5;
    }

    public rectangle(int x, int y)
    {
        length = x;
        breadth = y;
    }

    public int getLength() {return length;}
    public void setLength(int length) {this.length = length;}
    public int getBreadth() {return breadth;}
    public void setBreadth(int breadth) {this.breadth = breadth;}


}

public class AccessPractice2
{
    public static void main(String[] args)
    {
        rectangle r1 = new rectangle();
        r1.setLength(13);
        r1.setBreadth(5);
        rectangle r = new rectangle(13,6);
        System.out.println("Length and breadth of rectangle if we pass the values directly with arguments: "+r.getLength()+" and "+r.getBreadth());
    }
}
