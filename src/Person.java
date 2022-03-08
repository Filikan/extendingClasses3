import java.util.ArrayList;

public abstract class Person {
    private String name;
    private ArrayList<Person> PIKL = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Person(String name)
    {
        this.name = name;
    }
    public void Add(Person person)
    {
        PIKL.add(person);
    }

    public void Remove(Person person)
    {
        PIKL.remove(person);
    }

    public abstract void Talk();
}
