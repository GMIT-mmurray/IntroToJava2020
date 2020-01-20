public class Main {

    public static void main(String[] args) {
        // Following statement would create an object myPuppy
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

    }


}
