

public class Programm {

    public static void findMaxArea(Figure[] arr) {
        double max = arr[0].Area();
        Figure figureMax = arr[0];
        for (int i = 1; i < arr.length; i++ ) {
            if (arr[i].Area() >= max) {
                max = arr[i].Area();
                figureMax = arr[i];
            }
        }
        System.out.printf("\nФигура с максимальной площадью: %s, цвет: %s\n", figureMax.Shape(), figureMax.colour);
    }

    public static void printAllFigures(Figure[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Фигура: %s, Цвет: %s, Площадь: %f\n", arr[i].Shape(), arr[i].colour, arr[i].Area());
        }
    }
    public static void main(String[] args) {
        
        Figure[] figures = new Figure[6];

        figures[0] = new Square(new Point(0),new Point(2), FigureColour.RED);
        figures[1] = new Triangle(new Point(0),new Point(2, 4), FigureColour.RED);
        figures[2] = new Circle(new Point(0),new Point(2), FigureColour.BLUE);
        figures[3] = new Circle(new Point(0),new Point(3), FigureColour.GREEN);
        figures[4] = new Triangle(new Point(0),new Point(4, 2), FigureColour.BLUE);
        figures[5] = new Square(new Point(0),new Point(3,2), FigureColour.BLUE);
    
        printAllFigures(figures);
        findMaxArea(figures);

    }
}