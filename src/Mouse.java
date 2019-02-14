public class Mouse extends Animal{
    Mouse(){
        System.out.println("We have a mouse!");
    }

    @Override
    public String sleep(){
        return "A mouse sleeps quietly";
    }
    @Override
    public String eat(){
        return "A mouse eats cheese";
    }
}
