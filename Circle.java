/**
 * Класс кругов, заданных на плоскости точкой в центре круга и точкой на окружности
 */
public class Circle extends Figure {

    private String shape = "Круг";

    public String getShape() {
        return shape;
    }

    public Circle(Point a, Point b) {
        super(a, b);
    }

    @Override
    public double Area() {
        double radius = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = (Math.PI)*(Math.pow(radius, 2));
        return square;
    }
    
}
