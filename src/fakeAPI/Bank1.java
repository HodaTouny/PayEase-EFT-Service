package fakeAPI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Bank1 implements BankAPI {
    String filePath = "src/fakeAPI/bankusers.txt";
    String line;

    public boolean verifyUser(String cardNumber, String phone) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data.length >= 2 && data[0].trim().equals(phone) && data[1].trim().equals(cardNumber)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
}


    public boolean withdraw(String cardNumber, double amount) {
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
                        System.out.println("Insufficient balance");
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

    @Override
    public boolean deposit(String cardNumber, double amount) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder fileContent = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data[1].equals(cardNumber)) {
                    double balance = Double.parseDouble(data[2]);
                    balance += amount;
                    data[2] = String.valueOf(balance);
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


    @Override
    public boolean findUser(String cardNumber) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data[1].equals(cardNumber)) {
                    return true;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;

    }

}

