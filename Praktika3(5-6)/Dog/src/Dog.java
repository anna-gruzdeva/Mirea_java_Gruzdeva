public abstract class Dog {
    public String name, breed;

    public void SetName(String name) {
        this.name = name;
    }
    public void SetBreed(String breed) {
        this.breed = breed;
    }

    public String getName(){return name;}
    public String getType(){return breed;}
}
