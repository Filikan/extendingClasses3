public class CloseFriend extends Person{

    public CloseFriend(String name)
    {
        super(name);
    }

    @Override
    public void Talk() {
        System.out.println("Hi dearest,how can I help you?");
    }
}
