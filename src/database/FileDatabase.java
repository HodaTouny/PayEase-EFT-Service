package database;
import user.*;
import java.io.*;


public class FileDatabase implements IDatabase {
    private static final String FILE_PATH = "user.txt";

    @Override
    public void saveData(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(user.getData());
            writer.newLine();
            System.out.println("User data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public User loadData(String userName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length >= 5 && userData[0].equals(userName)) {
                    UserFactory userFactory = new UserFactoryConcrete();
                    User user = userFactory.createUser(userData[4]);
                    user.setUser(userData);
                    return user;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
