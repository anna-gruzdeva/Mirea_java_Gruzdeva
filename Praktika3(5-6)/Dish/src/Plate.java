public class Plate extends Dish {
    public String size;
    public Plate(String s, int p, String t)
    {
        size = s;
        price = p;
        type = t;
    }

    public void SetSize(String size) {
        this.size = size;
    }

    public String getSize(){return size;}

    @Override
    public String toString()
    {
        return "Type: "+this.type
                +", Size: "+this.size;
    }
}