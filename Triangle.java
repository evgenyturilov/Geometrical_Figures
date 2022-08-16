/**
 * Класс для равностороннего треугольника с длиной стороны, определяемой двумя точками на плоскости
 */
public class Triangle extends Figure{

    private String shape = "Треугольник";

    public Triangle(Point a, Point b) {
        super(a, b);
    }

    public String getShape() {
        return shape;
    }
    
    @Override
    public double Area() {
        double triangleSide = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = Math.pow(triangleSide, 2) * Math.sqrt(3) / 4;
        return square;
    }     
}
