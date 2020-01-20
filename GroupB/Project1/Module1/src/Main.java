public class Main {

    public static void main(String[] args) {
        // Following statement would create an object myPuppy

        Dog.Sex = "Male";

        Puppy myPuppy = new Puppy( "tommy",7 );
        Puppy myPuppy1 = new Puppy();
        Dog dog = new Dog("Sheep Dog", 8, "BW");
        Dog dog1 = new Dog(" Fox", 6,"Red");
        dog.barking();
        dog.hungry();
        dog.sleeping();
        dog1.barking();
        dog1.hungry();
        dog1.sleeping();
        dog.setAge(8);
        System.out.println("Breed :"+ dog.getBreed() + " Age  : " + dog.getAge() + "Color : " + dog.getColor() + ": "+ Dog.Sex);

        System.out.println (dog);

        System.out.println(Dog.Sex);
        System.out.println(dog1.Sex);

    }


}
