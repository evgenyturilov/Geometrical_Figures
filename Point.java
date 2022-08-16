/**
 * Класс для задания точки на двумерной плоскости
 */
public class Point {
    
    private int x, y;
    /**
     * Конструктор точки с координатами X и Y
     * @param valueX Координата точки X
     * @param valueY Координата точки Y
     */
    public Point(int valueX, int valueY) {
        this.x = valueX;
        this.y = valueY;
    }
    /**
     * Конструктор точки с координатой X равной координате Y
     * @param value Координата точки X = Y
     */
    public Point(int value) {
        this(value, value);
    }
    /**
     * Конструктор точки "по умолчанию" с координатами X = 0; Y = 0; 
     */
    public Point() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
