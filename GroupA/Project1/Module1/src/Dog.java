public class Dog {

    public static String Sex = "Male";

    private String name;
    private String breed;
    private int age;
    private String color;

    public Dog() {
      System.out.println(" Dog Default Constructor");
      name = "unknown";
      breed = "unknown";
      age = 0;
      color = "unknown";
    }
    public Dog(String name, String breed, int age, String color) {
        // This constructor has one parameter, name.
        System.out.print("This Dog constructor has one parameter, name ......");
        System.out.println(name);
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void barking() {
        System.out.println( name +" is Barking");
   }

    void hungry() {
        System.out.println( name +" is Hungry");
    }

    void sleeping() {
        System.out.println( name +" is Sleeping");
    }
}