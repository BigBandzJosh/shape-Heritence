public class Triangles extends shapes {
    private double base;
    private double height;

    public Triangles(double base, double height, String name, String color) {
        super(name, color);
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height;
    }
    public String toString() {
        return "Triangle: base = " + base + ", height = " + height +", color = " + getColor() + ", name = " + getName();
    }
}

