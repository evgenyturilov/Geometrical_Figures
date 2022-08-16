
public class Square extends Figure{

    public Square(Point a, Point b, FigureColour colour) {
        super(a, b, colour);
    }

    @Override
    public String Shape() {
        return "Квадрат";
    }

    @Override
    public double Area() {
        double squareSide = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = Math.pow(squareSide, 2);
        return square;
    }        
}   

