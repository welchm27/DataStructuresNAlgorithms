public class Circle implements Shape{

    int sides = 0;
    double radius;

    public void triangle(int sides, double radius){
        this.sides = sides;
        this.radius = radius;
    }


    public int sides() {
        return sides;
    }

    public double area() {
        return (3.14 * radius);
    }

    public double perimeter() {
        return (2 * 3.14 * radius);
    }
}   // END OF CLASS