public abstract class Figure3D implements FigureProperties,FigureVolume  {

    protected Point a;
    protected Point b;
    protected FigureColour colour;

    public Figure3D(Point a, Point b, FigureColour colour) {
        this.a = a;
        this.b = b;
        this.colour = colour;
    }

    @Override
    public String toString() {
        
        return String.format("Фигура: %s, Цвет: %s, Площадь: %f, Объем: %f\n",
                             Shape(), colour, Area(), Volume());
    }
}
