
public abstract class Figure implements FigureProperties{
    protected Point a;
    protected Point b;
    protected FigureColour colour;

    public Figure(Point a, Point b, FigureColour colour) {
        this.a = a;
        this.b = b;
        this.colour = colour;
    }
}
