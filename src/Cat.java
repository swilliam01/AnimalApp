/*
 * All Cats are Animals but all Animals are not Cats
 */
public class Cat extends Animal { //inheritance

    public Cat() {
        super();
        System.out.println("Now I am a Cat!");
    }

    @Override
    public String sleep() { //polymorphism
        return "A cat sleeps...";
    }

    @Override
    public String eat() { //polymorphism
        return "A cat eats...";
    }

    public String purr() {
        return "purrr...";
    }

}