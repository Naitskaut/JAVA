import java.util.Objects;

class Sport extends Person {
    protected String SportType;

    public Sport(String name, String SportType) {
        super(name);
        this.SportType = SportType;
    }

    public String getSportType() {
        return SportType;
    }
    @Override
    public void info() {
        System.out.println("Name: " + getName() + ", SportType: " + getSportType());
    }
    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        Sport sport = (Sport) obj;
        return Objects.equals(SportType, sport.SportType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), SportType);
    }

    @Override
    public String toString() {
        return "Sport{name='" + getName() + "', sportType='" + SportType + "'}";
    }
}
