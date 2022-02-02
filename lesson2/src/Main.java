import model.Person;
import model.Player;
import model.Trainer;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Benzema", 32, 15);
//        Trainer trainer = new Trainer("Anchelotti", 70, "Real Madrid");
//        trainer.badWords(player);
//        System.out.println("Age is " + player.getAge());
//        player.setAge(32 + 1);
//        System.out.println("Age is " + player.getAge());
//        Person person = new Player("Benzema", 32, 15);
        player.sayName();
        player.gol();
        player.gol(2);
    }
}
