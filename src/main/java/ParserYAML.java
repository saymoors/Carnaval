import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParserYAML {
    private final Yaml yaml;

    public ParserYAML() {
        LoaderOptions options = new LoaderOptions();
        yaml = new Yaml(options);
    }

    public List<Participiant> parse(String filePath) throws Exception {
        try (InputStream inputStream = new FileInputStream(filePath)) {
            List<Map<String, Object>> listMap = yaml.load(inputStream);
            List<Participiant> result = new ArrayList<>();

            for (Map<String, Object> map : listMap) {
                String name  = (String) map.get("name");
                String style = (String) map.get("style");
                result.add(new Participiant(name, style));
            }
            return result;
        } catch (IOException e) {
            throw new Exception("Файл не найден!");
        }
    }
}