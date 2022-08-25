public class Circle extends Figure2D {

        public Circle(Point a, Point b, FigureColour colour) {
                super(a, b, colour);
        }

        @Override
        public String Shape() {
                return "Круг";
        }

        @Override
        public double Area() {
                double diameter = Math.sqrt(Math.pow((a.getX() - b.getX()), 2)) + Math.sqrt(Math.pow((a.getY() - b.getY()), 2));
                double square = (Math.PI)*(Math.pow(diameter, 2)/4);
                return square;
        }

    

       
    
    
}
