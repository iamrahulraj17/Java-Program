import java.util.*;

class point{
    double x,y;
    static double distance(point p1, point p2)
    {
        double d = Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x))+((p2.y-p1.y)*(p2.y-p1.y)));
        return d;
    }
}
public class line extends point{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        point a = new point();
        a.x = sc.nextDouble();
        a.y = sc.nextDouble();
        point b = new point();
        b.x = sc.nextDouble();
        b.y = sc.nextDouble();
        System.out.println(distance(a, b));
        sc.close();
    }
}