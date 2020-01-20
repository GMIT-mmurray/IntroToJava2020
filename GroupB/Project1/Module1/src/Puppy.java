public class Puppy {

    String name;
    int age;

    // Default Constructor
    public Puppy() {
        name = "unknown";
        age = 0;
    }

    public Puppy(String name,int age) {
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name );
        this.name = name;
        this.age= age;
        }
 }

