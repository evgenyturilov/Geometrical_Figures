/**
 * Класс квадратов, заданных на плоскости двумя точками
 */
public class Square extends Figure{

    private String shape = "Квадрат";

    public String getShape() {
        return shape;
    }

    public Square(Point a, Point b) {
        super(a, b);
    }

    @Override
    public double Area() {
        double squareSide = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = Math.pow(squareSide, 2);
        return square;
    }   
}
