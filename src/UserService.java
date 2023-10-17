import java.util.List;

public class UserService {
    private List<String> users;

    // Rest of the code...

    public boolean isUserExists(String userName) {
        boolean found = false;
        for (int index = 0; index < users.size(); index++) {
            String user = users.get(index);
            if (userName.equals(user)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
