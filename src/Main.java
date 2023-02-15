public class Main {
    public static void main(String[] args) {
        shapes[] shapes = new shapes[3];
        shapes[0] = new Triangles(10, 5, "Triangle", "Red");
        shapes[1] = new circles(5, "Circle", "Blue");
        shapes[2] = new Squares(10, "Square", "Green");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
            System.out.println("Area = " + shapes[i].area());
        }
    }
}