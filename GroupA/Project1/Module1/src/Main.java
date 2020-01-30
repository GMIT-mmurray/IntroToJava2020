public class Main {

    public static void main(String[] args) {

        Dog.Sex = "Female";
        Puppy pup1 = new Puppy();
        Puppy pup2 = new Puppy("Alex");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("David","Sheep Dog", 7,"Red");
        System.out.println(dog2.getName());
        dog2.setName("Peter");

        dog1.setName("Collie");
        dog1.setColor("Blue");
        dog1.setAge(7);
        dog1.setBreed("Border Collie");

        System.out.println("name : " + dog1.getName());
        System.out.println("color : " + dog1.getColor());
        System.out.println("age: " + dog1.getAge());
        System.out.println("Breed : " + dog1.getBreed());

        dog1.barking();
        dog2.barking();

        dog1.hungry();
        dog2.hungry();

        dog1.sleeping();
        dog2.sleeping();

        System.out.println(dog1);

    }

}
