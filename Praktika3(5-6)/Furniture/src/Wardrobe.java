public class Wardrobe extends Furniture {
    public String mirror;

    public Wardrobe(String m, int p, String mi)
    {
        material = m;
        price = p;
        mirror = mi;
    }

    public void SetMirror(String mirror) {
        this.mirror = mirror;
    }

    public String getMirror(){return mirror;}
}
