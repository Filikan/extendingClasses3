public class Friend extends Person{

    public Friend(String name) {
        super(name);
    }

    @Override
    public void Talk() {
        System.out.println("Hi.");
    }
}
