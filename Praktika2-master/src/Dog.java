public class Dog {
    public String breed;
    public int age;
    public String dogcolour;

    public Dog(String b, int a, String d)
    {
        breed = b;
        age = a;
        dogcolour = d;
    }

    public void setBreed (String breed)
    {
        this.breed = breed;
    }
    public void setAge( int age)
    {
        this.age = age;
    }
    public void setDogcolour (String dogcolour)
    {
        this.dogcolour = dogcolour;
    }
    public String getBreed(String breed)
    {
        return breed;
    }
    public int getAge( int age)
    {
        return age;
    }
    public String getDogcolour(String dogcolour)
    {
        return dogcolour;
    }
    public void HumanAge( )
    {
        System.out.println(breed+"'age in human years is "+age*7+" years");
    }

    public String toString()
    {
        return this.breed+", age-"+this.age;
    }
}