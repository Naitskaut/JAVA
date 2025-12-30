import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        System.out.println("Members number: ");
        int n =  input.nextInt();
        input.nextLine();

        for(int i=0; i<n; i++){
            System.out.println("\nMember " + (i + 1));

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Surname: ");
            String surname = input.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(input.nextLine());

            System.out.print("Height (meters): ");
            double height = Double.parseDouble(input.nextLine());


            System.out.print("Sport type: ");
            String sportType = input.nextLine();

            Member member = new Member(name, surname, age, height, sportType);
            people.add(member);
        }

        people.add(new SportClub("Volleyball Club", 60, "Aruzhan"));
        people.add(new SportClub("Basketball Club", 45, "Dias"));
        System.out.println("\nALL OBJECTS ");
        for(Person p : people){
            p.info();
        }
        people.sort(Comparator.comparing(Person::getName));

        System.out.println("\nSorted: ");
        for(Person p : people){
            p.info();
        }
        System.out.println("\nSPORT CLUBS WITH 50+ MEMBERS");
        for (Person p : people) {
            if (p instanceof SportClub club && club.getMembers() >= 50) {
                club.info();
            }
        }
        System.out.println("\nSEARCH MEMBERS BY SPORT: Volleyball");
        for (Person p : people) {
            if (p instanceof Member member &&
                    member.getSportType().equalsIgnoreCase("Volleyball")) {
                member.info();
            }
        }
        System.out.println("\nEQUALS TEST");
        Member m1 = new Member("Ali", "Khan", 18, 1.75, "Football");
        Member m2 = new Member("Ali", "Khan", 18, 1.75, "Football");

        System.out.println(people.equals(people));

        System.out.println("\nCOMPARING ENTERED MEMBERS");
        for (int i = 0; i < people.size(); i++) {
            for (int j = i + 1; j < people.size(); j++) {
                if (people.get(i).equals(people.get(j))) {
                    System.out.println("Objects are equal:");
                    System.out.println(people.get(i));
                    System.out.println(people.get(j));
                }
            }
        }
    }



}
