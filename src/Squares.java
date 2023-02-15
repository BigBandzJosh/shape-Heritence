public class Squares extends shapes {
    private double side;
    public Squares(double side, String name, String color) {
        super(name, color);
        this.side = side;
    }
    public double area() {
        return side * side;
    }
    public String toString() {
        return "Square: side = " + side + ", color = " + getColor() + ", name = " + getName();
    }
}

