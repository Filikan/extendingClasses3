public class Foe extends Person{

    public Foe(String name){
        super(name);
    }

    @Override
    public void Talk() {
        System.out.println("Get out the way,I don't like you!");
    }
}
