public class Dog {

    public static String Sex;

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

    public  void barking() {
        System.out.println(breed + " Barking");
    }

    public void hungry() {
        System.out.println(breed + " Hungry");
    }

    public void sleeping() {
        System.out.println(breed +" sleeping");
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

    @Override
    public String toString() {
        return ("From toString ---- Breed :"+ breed + " Age  : " + age + "Color : " + color   + "Sex" + Sex);
    }
}
