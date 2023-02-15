public class circles extends shapes {
    private double radius;

    public circles(double radius,String name, String color) {
        super(name, color);
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle: radius = " + radius + ", color = " + getColor() + ", name = " + getName();

    }
}

