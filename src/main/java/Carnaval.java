import java.util.ArrayList;
import java.util.List;

public class Carnaval {
    private final List<Participiant> participiants;

    public Carnaval() {
        participiants = new ArrayList<>();
    }

    public void addParticipiant(Participiant participiant) {
        participiants.add(participiant);
    }

    public void dance() {
        System.out.println("Танцуют все!");

        for(Participiant participiant : participiants) {
            participiant.dance();
        }
    }
}
