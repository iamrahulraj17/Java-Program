public class constructor {
    private double radius;
    constructor(){
        radius=1.0;
    }
    public static void main(String[] args) {
        constructor c = new constructor();
        System.out.println("Radius: "+ c.radius);
    }
}
