public class Cup extends Dish {
    public String colour;
    public Cup(String c, int p, String t)
    {
        colour = c;
        price = p;
        type = t;
    }

    public void SetColour(String colour) {
        this.colour = colour;
    }

    public String getColour(){return colour;}

    @Override
    public String toString()
    {
        return "Type: "+this.type
                +", Colour: "+this.colour;
    }
}