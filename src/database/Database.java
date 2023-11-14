package database;
import user.*;
import java.io.*;


public class Database implements IDatabase {
    private static final String FILE_PATH = "user.txt";

    @Override
    public boolean saveData(User user) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            StringBuilder fileContent = new StringBuilder();
            boolean userExists = false;
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length >= 5 && userData[0].equals(user.getUserName())) {
                    String newData = user.getData();
                    System.arraycopy(newData.split(","), 0, userData, 0, userData.length);
                    userExists = true;
                }
                fileContent.append(String.join(",", userData)).append("\n");
            }
            if (!userExists) {
                fileContent.append(user.getData()).append("\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                writer.write(fileContent.toString());
            }

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
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

    @Override
    public Boolean deposit(String userName, double amount) {
        User user = loadData(userName);
        if (user != null) {
            user.setPayEase(user.getPayEase() + amount);
            saveData(user);
            return true;
        }return false;
    }

}
