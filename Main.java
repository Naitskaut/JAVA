import java.util.*;
import java.sql.*;

public class Main {

    static String url = "jdbc:postgresql://localhost:5432/sportdb";
    static String user = "postgres";
    static String password = "root";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        System.out.println("Members number: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
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

            people.add(new Member(name, surname, age, height, sportType));
        }

        // твоя логика ↓
        people.add(new SportClub("Volleyball Club", 60, "Aruzhan"));
        people.add(new SportClub("Basketball Club", 45, "Dias"));

        for (Person p : people) {
            p.info();
        }

        // ✅ ДОБАВЛЕННЫЕ СТРОКИ
        saveMembersToDB(people);
        readMembersFromDB();
    }

    // ===== JDBC METHODS =====

    static void saveMembersToDB(ArrayList<Person> people) {
        String sql = "INSERT INTO members(name, surname, age, height, sport_type) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            for (Person p : people) {
                if (p instanceof Member m) {
                    ps.setString(1, m.getName());
                    ps.setString(2, m.getSurname());
                    ps.setInt(3, m.getAge());
                    ps.setDouble(4, m.getHeight());
                    ps.setString(5, m.getSportType());
                    ps.executeUpdate();
                }
            }

            System.out.println("Members saved to database");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void readMembersFromDB() {
        String sql = "SELECT * FROM members";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\nMEMBERS FROM DATABASE:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + ". " +
                                rs.getString("name") + " " +
                                rs.getString("surname") +
                                " (" + rs.getString("sport_type") + ")"
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
