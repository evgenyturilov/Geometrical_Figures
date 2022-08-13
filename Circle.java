/**
 * Класс кругов, заданных на плоскости точкой в центре круга и точкой на окружности
 */
public class Circle extends Shape{
    
    private Point a;
    private Point b;

    public Circle(String shape, String colour, Point a, Point b) {
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

    /**
     * Функция вычисления площади круга
     * @return
     */
    public double Area() {
        double radius = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
        double square = (Math.PI)*(Math.pow(radius, 2));
        return square;
    }

}
