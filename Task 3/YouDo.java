import java.util.ArrayList;
import java.util.List;



class User {

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}



class UserValidator {

    public boolean validate(User user) {

        if (user.getName() == null || user.getName().isEmpty()) {
            return false;
        }

        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            return false;
        }

        return true;
    }
}



class UserRepository {

    private List<User> users = new ArrayList<>();

    public void save(User user) {

        users.add(user);

        System.out.println(
            "User saved to database: " + user.getName()
        );
    }
}


public class Main {

    public static void main(String[] args) {

    
        User user = new User(
                "Alice",
                "alice@example.com"
        );


 
        UserValidator validator = new UserValidator();

        if (validator.validate(user)) {

   
            UserRepository repository = new UserRepository();
            repository.save(user);

        } else {
            System.out.println("Invalid user information.");
        }
    }
}
