/**
 * Класс задает форму и цвет фигуры
 */
public abstract class Figure {

    protected String shape;
    protected String colour;
    /**
     * Конструктор класса
     * @param shape форма фигуры
     * @param colour цвет фигуры
     */
    protected Figure(String shape, String colour) {
        this.shape = shape;
        this.colour = colour;
    }

    public String getShape() {
        return shape;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract double Area();
}