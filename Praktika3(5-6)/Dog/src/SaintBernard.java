public class SaintBernard extends Dog {
    public int age;
    public SaintBernard(int a, String n, String b)
    {
        age = a;
        name = n;
        breed = b;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public int getAge(){return age;}

    @Override
    public String toString()
    {
        return "Name: "+this.name
                +", Breed: "+this.breed
                +", Age: "+this.age;
    }
}
