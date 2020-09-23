public class Retriever extends Dog {
    public String colour;

    public Retriever(String c, String n, String b)
    {
        colour = c;
        name = n;
        breed = b;
    }

    public void SetColour(String colour) {
        this.colour = colour;
    }

    public String getColour(){return colour;}

    @Override
    public String toString()
    {
        return "Name: "+this.name
                +", Breed: "+this.breed
                +", Colour: "+this.colour;
    }
}
