

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
        System.out.printf("\nФигура с максимальной площадью: %s\n", figureMax.getShape());
    }

    public static void printAllFigures(Figure[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Фигура: %s, Площадь: %f\n", arr[i].getShape(), arr[i].Area());
        }
    }
    public static void main(String[] args) {
        
        Figure[] figures = new Figure[6];

        figures[0] = new Square(new Point(), new Point(2, 3));
        figures[1] = new Circle(new Point(3), new Point(4));
        figures[2] = new Triangle(new Point(2, 1), new Point(3));
        figures[3] = new Square(new Point(1), new Point(2,1));
        figures[4] = new Circle(new Point(2), new Point(3, 2));
        figures[5] = new Triangle(new Point(4), new Point(6));
    
        printAllFigures(figures);
        findMaxArea(figures);

    }
}