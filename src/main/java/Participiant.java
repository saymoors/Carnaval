public class Participiant {
    private String name;
    private String style;

    public Participiant(String name, String style) {
        this.name = name;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void dance() {
        System.out.println(name + " танцует " + style);
    }
}
