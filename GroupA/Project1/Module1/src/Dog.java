public class Dog {
    String name;
    String breed;
    int age;
    String color;

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
    void barking() {
    }

    void hungry() {
    }

    void sleeping() {
    }
}