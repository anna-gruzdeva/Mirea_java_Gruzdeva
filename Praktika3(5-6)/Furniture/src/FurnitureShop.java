import java.util.Scanner;
public class FurnitureShop extends Furniture {
    public void Catalog()
    {
        Scanner in = new Scanner(System.in);
        Chair c1 = new Chair("wood", 250, "red");
        Wardrobe w1 = new Wardrobe("wood", 1000, "This wardrobe has a mirror");
        System.out.println("Catalog:");
        System.out.println("Chairs");
        System.out.println("Material:");
        System.out.println(c1.getMaterial());
        System.out.println("Price:");
        System.out.println(c1.getPrice());
        System.out.println("Colour:");
        System.out.println(c1.getColour());
        System.out.println("\n");
        System.out.println("Wardrobes");
        System.out.println("Material:");
        System.out.println(w1.getMaterial());
        System.out.println("Price:");
        System.out.println(w1.getPrice());
        System.out.println("Mirrors:");
        System.out.println(w1.getMirror());
        System.out.println("\n");
        System.out.println("If you want to buy something press 1 otherwise press 0");
        int shop, item, amount, money = 0;
        shop = in.nextInt();

        while (shop == 1)
        {
                System.out.println("If you want to buy a chair/chairs press 0");
                System.out.println("If you want to buy a wardrobe/wardrobes press 1");
                item = in.nextInt();
                if (item == 0)
                {
                    System.out.println("Enter the amount of chairs");
                    amount = in.nextInt();
                    money += amount * c1.getPrice();
                    System.out.println("If you want to buy something else press 1 otherwise press 0");
                    shop = in.nextInt();
                }
                else
                {
                    System.out.println("Enter the amount of wardrobes");
                    amount = in.nextInt();
                    money += amount * w1.getPrice();
                    System.out.println("If you want to buy something else press 1 otherwise press 0");
                    shop = in.nextInt();
                }
            System.out.println("The price of your purchase is: ");
            System.out.println(money);
        }
    }
}