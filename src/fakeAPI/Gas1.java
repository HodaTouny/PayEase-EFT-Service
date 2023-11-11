package fakeAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gas1 implements CompanyAPI{
    @Override
    public String CreateBilll(String crn) {
        StringBuilder result = new StringBuilder();
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader("src/fakeAPI/GasCompany1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equals(crn)) {
                    result.append(line);
                    found = true;
                }
            }
            if (!found) {
                return "Customer with ID " + crn + " not found. Please check the CRN and try again.";
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return result.toString();
    }
}
