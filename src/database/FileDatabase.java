package database;
import user.*;
import java.io.*;


public class FileDatabase implements IDatabase {

    private static final String FILE_PATH = "user.txt";

    @Override
    public void saveData(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
//            if (user instanceof BankUser) {
//                BankUser bankUser = (BankUser) user;
//                writer.write(bankUser.getUserName() + "," + bankUser.getPassword() + "," + bankUser.getPayEase() + "," +
//                        bankUser.getPhone() + "," + bankUser.getUserType() + "," + bankUser.getCardNumber());
//            } else if (user instanceof WalletUser) {
//                WalletUser walletUser = (WalletUser) user;
//                writer.write(walletUser.getUserName() + "," + walletUser.getPassword() + "," + walletUser.getPayEase() + "," +
//                        walletUser.getPhone() + "," + walletUser.getUserType() + "," + walletUser.getWalletName());
//            }
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
                    String userType = userData[4];
                    if ("bank".equals(userType)) {
                        if (userData.length == 6) {
                            return new BankUser(userData[0], userData[1], Double.parseDouble(userData[2]),
                                    userData[3], userData[4], userData[5]);
                        }
                    } else if ("wallet".equals(userType)) {
                        if (userData.length == 6) {
                            return new WalletUser(userData[0], userData[1], Double.parseDouble(userData[2]),
                                    userData[3], userData[4], userData[5]);
                        }
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }




}
