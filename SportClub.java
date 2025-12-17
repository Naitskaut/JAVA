class SportClub {
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
