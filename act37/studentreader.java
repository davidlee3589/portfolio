import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.json"));
            Gson gson = new Gson();
            Student student = gson.fromJson(reader, Student.class);
            System.out.println("Student information:");
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Major: " + student.getMajor());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
