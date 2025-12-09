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
class Athlete{
    private String name;
    private String surname;
    private String typeSport;
    public Athlete(String name, String surname, String typeSport) {
        this.name = name;
        this.surname = surname;
        this.typeSport = typeSport;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getTypeSport() {
        return typeSport;
    }
    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }
    public void info() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Type: " + typeSport);
    }
}
class SportClub{
    private String nameClub;
    private int members;
    private String teamLead;
    public SportClub(String nameClub, int members, String teamLead) {
        this.nameClub = nameClub;
        this.members = members;
        this.teamLead = teamLead;
    }
    public String getNameClub() {
        return nameClub;
    }
    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }
    public int getMembers() {
        return members;
    }
    public void setMembers(int members) {
        this.members = members;
    }
    public String getTeamLead() {
        return teamLead;
    }
    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }
    public void info() {
        System.out.println("NameClub: " + nameClub + ", Members: " + members + ", TeamLead: " + teamLead);
    }
}

public class Main {
    public static void main(String[] args) {
        Sport s1 = new Sport("Volleyball","outdoor",6);
        Sport s2 = new Sport("Football","outdoor",5);
        s1.info();
        s2.info();
        System.out.println();
        Athlete a1 = new Athlete("Yeskendir", "Abraimov", "Fitness");
        Athlete a2 = new Athlete("Amir", "Kapasov", "HobbyHorsing");
        a1.info();
        a2.info();
        System.out.println();
        SportClub b1 = new SportClub("Chess", 8, "Dias");
        SportClub b2 = new SportClub("Diet", 1, "Agzam");
        b1.info();
        b2.info();
    }

}