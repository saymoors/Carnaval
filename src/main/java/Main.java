import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carnaval carnaval = new Carnaval();
        ParserYAML parser = new ParserYAML();
        List<Participiant> participiants = parser.parse("C:/Users/HONOR/Documents/Теория и технология программирования/Домашняя работа 1/participiants.yaml");
        for(Participiant participiant : participiants) {
            carnaval.addParticipiant(participiant);
        }
        carnaval.dance();
    }
}
