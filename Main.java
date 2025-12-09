class Sport {
    private String name;
    private String category;
    private int level;
    public Sport(String name, String category, int level) {
        this.name = name;
        this.category = category;
        this.level = level;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public void info(){
        System.out.println("Name: " + name+", Category: "+category+", Level: "+level);
    }
}
public class Main {
    public static void main(String[] args) {
        Sport s1 = new Sport("Volleyball","outdoor",6);
        Sport s2 = new Sport("Football","outdoor",5);
        s1.info();
        s2.info();
    }
}