import java.util.Objects;

class SportClub extends Person {
    private int members;
    private String teamLead;

    public SportClub(String name, int members, String teamLead) {
        super(name);
        this.members = members;
        this.teamLead = teamLead;
    }
    public int getMembers() {
        return members;
    }

    @Override
    public void info() {
        System.out.println("Name of Club: " + getName() + ", Members: " + members + ", TeamLead: " + teamLead);
    }
    public boolean equals(SportClub sportClub) {
        if(!super.equals(sportClub)) return false;
        SportClub club = (SportClub) sportClub;
        return members == club.members && teamLead.equals(club.teamLead);
    }
    public int hashCode(){
        return Objects.hash(super.hashCode(), members, teamLead);
    }
    public String toString(){
        return "SportClub{name='" + getName() +"', members=" + members +", teamLead='" + teamLead + "'}";
    }
}


