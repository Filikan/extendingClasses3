import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void Call(ArrayList<Person> kisiler){
        for(Person kisi:kisiler){
            kisi.Talk();
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        Random rnd = new Random();
        int a = 0;
        for(int i=0;i<10;i++)
        {
             a = rnd.nextInt(3);

        }
        
        if(a == 0)
        {
            person.add(new Foe("Düşman"));
        }
        else if(a == 1)
        {
            person.add(new CloseFriend("Friend"));
        }
        else
        {
            person.add(new CloseFriend("Kanka"));
        }
        Call(person);
    }
}
