public class Chair extends Furniture {
    public String colour;

    public Chair(String m, int p, String c)
    {
        material = m;
        price = p;
        colour = c;
    }

    public void SetColour(String colour) {
        this.colour = colour;
    }

    public String getColour(){return colour;}
}