public abstract class Figure implements FigureArea {
    
    protected String shape;
    protected Point a;
    protected Point b;

    public String getShape() {
        return shape;
    }

    public Figure(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
}