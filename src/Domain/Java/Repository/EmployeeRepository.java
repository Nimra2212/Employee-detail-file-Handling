package Repository;

import Employee.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class EmployeeRepository {
    protected static void save()
    {
        File file =new File("D:\\aptech.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write("Name: Nimra");
            fileWriter.write("cnic: 090078601");
            fileWriter.close();


        } catch (IOException e) {
           System.out.println(e.getMessage());
        }
    }
   public void hasEmployee(){
       FileInputStream fsStram = new FileInputStream("D:\\aptech.txt"))
       }public void hasEmployee(){
        FileInputStream fsStram = new FileInputStream("D:\\aptech.txt"))
   }







}
