/**
 * Класс квадратов, заданных на плоскости двумя точками
 */
public class Square extends Figure {
    
    private Point a;
    private Point b;

    protected Square(String shape, String colour, Point a, Point b) {
        super(shape, colour);
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public double Area() {
        double squareSide = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = Math.pow(squareSide, 2);
        return square;
    }
    
        
       
}
