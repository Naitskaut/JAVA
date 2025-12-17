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