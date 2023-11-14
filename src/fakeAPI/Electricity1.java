package fakeAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Electricity1 implements CompanyAPI{
    @Override
    public String CreateBilll(String crn) {
        boolean found = false;
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/fakeAPI/ElectricityCompany1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equals(crn)) {
                    result.append(line);
                    found = true;
                }
            }
            if (!found) {
                return null;
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return result.toString();
    }
}
