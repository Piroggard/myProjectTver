import ru.manager.Manager;
import ru.plase.Address;
import ru.plase.Plase;
import ru.plase.Type;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addPlase(new Plase(Type.CAFE , new Address("Rus" , "Tver" , "Osnabruk" , 30) ,
                "ChikenHaus" ));
        System.out.println(manager.getPlaseType("CAFE"));
    }

}
