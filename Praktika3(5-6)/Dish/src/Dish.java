public abstract class Dish {
    public int price;
    public String type;

    public void SetPrice(int price) {
        this.price = price;
    }
    public void SetType(String type) {
        this.type = type;
    }

    public int getPrice(){return price;}
    public String getType(){return type;}
}