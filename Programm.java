import java.util.List;

public class Programm {

    public static void findMaxArea(Figure2D[] arr) {
        double max = arr[0].Area();
        Figure2D figureMax = arr[0];
        for (int i = 1; i < arr.length; i++ ) {
            if (arr[i].Area() >= max) {
                max = arr[i].Area();
                figureMax = arr[i];
            }
        }
        System.out.printf("\nФигура с максимальной площадью: %s, цвет: %s\n", figureMax.Shape(), figureMax.colour);
    }

    public static void printAllFigures(Figure2D[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Фигура: %s, Цвет: %s, Площадь: %f\n", arr[i].Shape(), arr[i].colour, arr[i].Area());
        }
    }

    public static void maxSquare(List<Figure2D> list ) {
        double max = list.get(0).Area();
        Figure2D maxFigure = list.get(0); 
        for(Figure2D item : list) {
            if (item.Area() >= max) {
                max = item.Area();
                maxFigure = item;
            }
        }
        System.out.printf("\nМаксикальная площадь %f у фигуры %s, цвета %s\n\n", max, maxFigure.Shape(), maxFigure.colour.getName() );
    }
    public static void main(String[] args) {
        
        // Figure[] figures = new Figure[6];

        // figures[0] = new Square(new Point(0),new Point(2), FigureColour.RED);
        // figures[1] = new Triangle(new Point(0),new Point(2, 4), FigureColour.RED);
        // figures[2] = new Circle(new Point(0),new Point(2), FigureColour.BLUE);
        // figures[3] = new Circle(new Point(0),new Point(3), FigureColour.GREEN);
        // figures[4] = new Triangle(new Point(0),new Point(4, 2), FigureColour.BLUE);
        // figures[5] = new Square(new Point(0),new Point(3,2), FigureColour.BLUE);
    
        // printAllFigures(figures);
        // findMaxArea(figures);

        Figure2D figureOne = new Square(new Point(0),new Point(2), FigureColour.RED);
        Figure2D figureTwo = new Triangle(new Point(0),new Point(2, 4), FigureColour.RED);
        Figure2D figureThree = new Circle(new Point(0),new Point(2), FigureColour.BLUE);
        Figure2D figureFour = new Circle(new Point(0),new Point(3), FigureColour.GREEN);
        Figure2D figureFive = new Triangle(new Point(0),new Point(4, 2), FigureColour.BLUE);
        Figure2D figureSix = new Square(new Point(0),new Point(3,2), FigureColour.BLUE);

        // List<Figure> figures = new ArrayList<Figure>();

        // figures.add(figureOne);
        // figures.add(figureTwo);
        // figures.add(figureThree);
        // figures.add(figureFour);
        // figures.add(figureFive);
        // figures.add(figureSix);

        List<Figure2D> figures = List.of(figureOne,figureTwo, figureThree, figureFour, figureSix, figureFive);
        

        maxSquare(figures);
        System.out.println(figures);

    }
}