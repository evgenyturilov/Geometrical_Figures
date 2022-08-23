public class Sphere extends Figure3D {

    public Sphere(Point a, Point b, FigureColour colour) {
        super(a, b, colour);
    }

    @Override
    public double Volume() {
        double radius = (Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2)))/2;
        double volume = 4/3*(Math.PI)*(Math.pow(radius, 3));
        return volume;
    }

    @Override
    public String Shape() {
        return "Шар";
    }
    
    @Override
    public double Area() {
        double diameter = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = 4*(Math.PI)*(Math.pow(diameter, 2)/4);
        return square;
    }
    
}
