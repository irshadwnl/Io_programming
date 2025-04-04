package readJsonFile;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            File file=new File("C:\\Users\\Irshad\\IdeaProjects\\jsonAssignment\\src\\main\\java\\readJsonFile\\user.json");
            List<User> users = objectMapper.readValue(
                    file,new TypeReference<List<User>>() {}
            );
            for (User user : users) {
                System.out.println("Name:- "+user.getName() + ", Email:- "+user.getEmail());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
