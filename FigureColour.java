public enum FigureColour {
    RED("Красный"),
    GREEN("Зеленый"),
    BLUE("Синий");
    private String name;

    private FigureColour(String colour) {
        name = colour;
    }

    public String getName() {
        return name;
    }



}