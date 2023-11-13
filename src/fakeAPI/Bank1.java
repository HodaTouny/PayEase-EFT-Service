package fakeAPI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Bank1 implements BankAPI {
    String filePath = "src/fakeAPI/bankusers.txt";
    String line;
    public boolean verifyUser(String cardNumber, String phone){
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                    if (data[0].equals(phone) && data[1].equals(cardNumber) ) {
                        return true;
                    }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean withdraw(String cardNumber, double amount){
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder fileContent = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data[1].equals(cardNumber)) {
                    double balance = Double.parseDouble(data[2]);
                    if (balance >= amount) {
                        balance -= amount;
                        data[2] = String.valueOf(balance);
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

