public class Dog extends Animal{
    Dog(){
        System.out.println("There is a Dog");
    }
    @Override
    public String sleep() {
        return "A dog sleeps deep";
    }

    @Override
    public String eat(){
        return "A dog eats bones";
    }

    public String runs(){
        return "A dog runs fast";
    }
}
