import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carnaval carnaval = new Carnaval();
        System.out.println("\n[Введите exit для выхода из программы]");
        while(true) {
            try {
                ParserYAML parser = new ParserYAML();
                Scanner scanner = new Scanner(System.in);
                System.out.print("\nВведите путь к файлу YAML: ");
                String filePath = scanner.nextLine();
                if(filePath.equals("exit")) {
                    break;
                }
                List<Participiant> participiants = parser.parse(filePath);
                for (Participiant participiant : participiants) {
                    carnaval.addParticipiant(participiant);
                }
                carnaval.dance();
            } catch (Exception exception) {
                System.out.println("Ошибка: " + exception.getMessage());
            }
        }
    }
}
