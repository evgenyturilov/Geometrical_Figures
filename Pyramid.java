public class Pyramid extends Figure3D {

    public Pyramid(Point a, Point b, FigureColour colour) {
        super(a, b, colour);
    }

    @Override
    public String Shape() {
        return "Пирамида";
    }

    @Override
    public double Area() {
        double side = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double area = 4 * (Math.pow(side, 2) * Math.sqrt(3) / 4);
        return area;
    }

    @Override
    public double Volume() {
        double side = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double hight = side / 3 * (Math.sqrt(2));
        double volume = hight*(Math.pow(side, 2))/(4*(Math.sqrt(3)));
        return volume;
    }
}
