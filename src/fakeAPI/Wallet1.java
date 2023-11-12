package fakeAPI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Wallet1 implements WalletAPI {
    String filePath = "src/fakeAPI/walletuser.txt";
    String line;
    public boolean verifyUser(String walletName,String phone){
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length > 0 && parts[0].equals(phone)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean withdraw(String phoneNumber, double amount){
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder fileContent = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] data = line.split("|");
                if (data[0].equals(phoneNumber)) {
                    double balance = Double.parseDouble(data[1]);
                    if (balance >= amount) {
                        balance -= amount;
                        data[1] = String.valueOf(balance);
                    } else {
                        return false;
                    }
                }
                fileContent.append(String.join("|", data)).append("\n");
            }
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(fileContent.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
