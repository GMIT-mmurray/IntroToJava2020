public class Dog {

    private String breed;
    private int age;
    private String color;

    public Dog () {
     // init your instance variables
     breed = "unknown";
     age = 0;
     color = "unknown";
    }
    public Dog(String breed, int age, String color) {
     this.breed = breed;
     this.age = age;
     this.color = color;
     }

    void barking() {
        System.out.println(breed + " Barking");
    }

    void hungry() {
        System.out.println(breed + " Hungry");
    }

    void sleeping() {
        System.out.println(breed +" sleeping");
    }
}
