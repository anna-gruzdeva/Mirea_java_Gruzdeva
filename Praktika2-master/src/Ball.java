public class Ball {
    public String type;
    public int diameter;
    public String colour;

    Ball(String type, int diameter, String colour) {
        this.type = type;
        this.diameter = diameter;
        this.colour = colour;
    }
    public String toString() {
        return this.type + ", " + this.diameter + ", " + this.colour;

    }
}
