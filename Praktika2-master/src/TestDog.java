public class TestDog {
    public static void main(String[] agr)
    {
        Dog dog1 = new Dog("Toby",2, "white");
        Dog dog2 = new Dog("Marta", 3, "brown and white");
        System.out.println(dog1);
        System.out.println(dog2);
        dog1.HumanAge();
        dog2.HumanAge();
        String[] Dogs={"Retriever", "Saint Bernard"};
        for (int i = 0; i < 2; i++) {
            System.out.println(Dogs[i]);
        }
    }
}
