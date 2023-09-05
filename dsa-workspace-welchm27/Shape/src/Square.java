public class Square implements Shape{

    private int length;
//    private int width;
//    private int sides;

    public Square(int length) {
        this.length = length;
//        this.width = width;
//        this.sides = sides;
    }

    public int sides() {
        return 4;
    }

    public double area() {
        return length * length;
    }

    public double perimeter() {
        return length * 4;
    }
}   // END OF CLASS