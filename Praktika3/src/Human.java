public class Human {
    private String name, gender;
    private int age;

    public Human(String n, String g, int a)
    {
        name = n;
        gender = g;
        age = a;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public static class Head
    {
        private String hair_colour, eye_colour;

        public Head(String h, String e)
        {
            hair_colour = h;
            eye_colour = e;
        }

        public void setHair_colour(String hair_colour)
        {
            this.hair_colour = hair_colour;
        }

        public void setEye_colour(String eye_colour)
        {
            this.eye_colour = eye_colour;
        }

        public String getHair_colour()
        {
            return hair_colour;
        }

        public String getEye_colour()
        {
            return eye_colour;
        }
    }

    public static class Leg
    {
        private String legs;

        public Leg(String l)
        {
            legs = l;
        }

        public void setLegs(String legs)
        {
            this.legs = legs;
        }

        public String getLegs()
        {
            return legs;
        }
    }

    public static class Hand
    {
        private String hands;

        public Hand(String h)
        {
            hands = h;
        }

        public void setHands(String hands)
        {
            this.hands = hands;
        }

        public String getHands()
        {
            return hands;
        }
    }

    public static void main(String[] agr)
    {
        Human human = new Human("Kira", "male", 33);
        Human.Head head = new Human.Head("blond", "blue");
        Human.Leg leg = new Human.Leg("exist");
        Human.Hand hand = new Human.Hand("exist");
        System.out.println("Name: "+human.getName()+", Gender: "+human.getGender()+", Age: "+human.getAge());
        System.out.println("Hair colour: "+head.getHair_colour()+", Eye colour: "+head.getEye_colour());
        System.out.println("Legs: "+leg.getLegs());
        System.out.println("Hands: "+hand.getHands());
    }
}