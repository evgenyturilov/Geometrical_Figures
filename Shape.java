/**
 * Класс задает форму и цвет фигуры
 */
public class Shape {

    protected String shape;
    protected String colour;
    /**
     * Конструктор класса
     * @param shape форма фигуры
     * @param colour цвет фигуры
     */
    protected Shape(String shape, String colour) {
        this.shape = shape;
        this.colour = colour;
    }

    public String getShape() {
        return shape;
    }

    public String getColour() {
        return colour;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}