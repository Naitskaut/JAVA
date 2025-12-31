import java.util.Objects;
class Member extends Sport {
    private String surname;
    private int age;
    private double height;

    public Member(String name, String sportType) {
        super(name, sportType);
        this.surname = "Unknown";
        this.age = 0;
        this.height = 0;
    }

    public Member(String name, String surname, int age, double height, String SportType) {
        super(name, SportType);
        this.surname = surname;
        this.age = age;
        this.height = height;
    }

    public void info(){
        System.out.println("Member: " + getName() +" " + surname +", Age: " + age +", Height: " + height +", Sport: " + getSportType());
    }
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Member member = (Member) o;
        return age == member.age &&
                Double.compare(member.height, height) == 0 &&
                Objects.equals(surname, member.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), surname, age, height);
    }

    @Override
    public String toString() {
        return "Member{name='" + getName() +"', surname='" + surname +"', age=" + age +", height=" + height +", sport='" + getSportType() + "'}";
    }


}
