
public abstract class Figure2D implements FigureProperties{
    protected Point a;
    protected Point b;
    protected FigureColour colour;

    public Figure2D(Point a, Point b, FigureColour colour) {
        this.a = a;
        this.b = b;
        this.colour = colour;
    }

    @Override
    public String toString() {
        
        return String.format("Фигура: %s, Цвет: %s, Площадь: %f\n", Shape(), colour, Area());
    }
}
