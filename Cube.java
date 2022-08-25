
public class Cube extends Figure3D{

    public Cube(Point a, Point b, FigureColour colour) {
        super(a, b, colour);
    }

    @Override
    public String Shape() {
        return "Куб";
    }

    @Override
    public double Area() {
        double side = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double area = 6*(Math.pow(side, 2));
        return area;
    }

    @Override
    public double Volume() {
        double side = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double volume = Math.pow(side, 3);
        return volume;
    }
    
}
