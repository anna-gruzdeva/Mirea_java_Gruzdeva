public abstract class Furniture {
    public String material;
    public int price;

    public void SetMaterial(String material) {
        this.material = material;
    }

    public void SetPrice(int price) {
        this.price = price;
    }

    public String getMaterial(){return material;}
    public int getPrice(){return price;}
}
