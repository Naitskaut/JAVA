class Athlete {
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
