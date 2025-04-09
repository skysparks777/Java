class Shape {
    String name = "Shape";

    public void displayDetails() {
        System.out.println("Shape: " + name);
        System.out.println("This is a geometric figure.");
    }

}
class Polygon extends Shape {
    int sides;

    public Polygon(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Polygon with " + sides + " sides.");
    }
}
