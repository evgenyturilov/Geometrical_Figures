public class Programm {
    public static void main(String[] args) {
        
        Square figureOne = new Square("Квадрат", "Красный", new Point(), new Point(2, 3));
        Circle figureTwo = new Circle("Круг", "Красный", new Point(3), new Point(4));
        Triangle figureThree = new Triangle("Треугольник", "Зеленый", new Point(2, 1), new Point(3));
        Square figureFour = new Square("Квадрат", "Зеленый", new Point(1), new Point(2,1));
        Circle figureFive = new Circle("Круг", "Красный", new Point(2), new Point(3, 2));
        Triangle figureSix = new Triangle("Треугольник", "Синий", new Point(4), new Point(6));
    
        double[] listOfSquares = new double[6];
        listOfSquares[0] = figureOne.Area();
        listOfSquares[1] = figureTwo.Area();
        listOfSquares[2] = figureThree.Area();
        listOfSquares[3] = figureFour.Area();
        listOfSquares[4] = figureFive.Area();
        listOfSquares[5] = figureSix.Area();

        double max = listOfSquares[0];

        for( int i = 1; i > listOfSquares.length; i++) {
            if (listOfSquares[i] > max) {
                max = listOfSquares[i];
            }
        }

        System.out.println(max);
    }
}
