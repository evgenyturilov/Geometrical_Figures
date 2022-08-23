public class Triangle extends Figure2D{

    public Triangle(Point a, Point b, FigureColour colour) {
        super(a, b, colour);
    }

    @Override
    public String Shape() {
        return "Треугольник";
    }

    @Override
    public double Area() {
        double side = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double area = Math.pow(side, 2) * Math.sqrt(3) / 4;
        return area;
    }
}
