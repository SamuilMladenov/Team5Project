package GroupProject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {
    private static final String CSV_FILE = "UserData.csv";

    public static List<User> readUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    users.add(new User(data[0], data[1], Integer.parseInt(data[2])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void writeUser(User user) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
            bw.write(user.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

