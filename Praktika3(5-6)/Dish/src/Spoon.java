public class Spoon extends Dish {
    public String material;
    public Spoon(String m, int p, String t)
    {
        material = m;
        price = p;
        type = t;
    }

    public void SetMaterial(String material) {
        this.material = material;
    }

    public String getMaterial(){return material;}

    @Override
    public String toString()
    {
        return "Type: "+this.type
                +", Material: "+this.material;
    }
}