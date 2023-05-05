import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 123456, "Computer Science");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(student);
        try {
            FileWriter writer = new FileWriter("students.json");
            writer.write(jsonString);
            writer.close();
            System.out.println("Student information has been written to students.json file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
