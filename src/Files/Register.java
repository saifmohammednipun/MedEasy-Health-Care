package Files;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Register {
    public static void main(String[] args) {
        File dir = new File("Registration");
        dir.mkdir();
        String LocationOfRegistration = dir.getAbsolutePath();

        File AdminRegistration =new File (LocationOfRegistration+"/AdminRegistration.txt");
        File DoctorRegistration =new File (LocationOfRegistration+"/DoctorRegistration.txt");
        File PharmacistRegistration =new File (LocationOfRegistration+"/PharmacistRegistration.txt");

        try{
            AdminRegistration.createNewFile();
            DoctorRegistration.createNewFile();
            PharmacistRegistration.createNewFile();
            System.out.println("File is created.");
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
