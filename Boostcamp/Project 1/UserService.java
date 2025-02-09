import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
        System.out.println(user.getUsername() + " əlavə edildi");
    }

    public void delete(int id) {
        users.removeIf(user -> user.getId() == id);
        System.out.println("İstifadəçi silindi: ID = " + id);
    }

    public void update(int id, String newUsername) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setUsername(newUsername);
                System.out.println("İstifadəçi yeniləndi: " + newUsername);
                return;
            }
        }
        System.out.println("İstifadəçi tapılmadı: ID = " + id);
    }

    public void getAll() {
        if (users.isEmpty()) {
            System.out.println("Sistemdə heç bir istifadəçi yoxdur.");
            return;
        }
        System.out.println("Bütün istifadəçilər:");
        for (User user : users) {
            System.out.println(user.getUsername() + " (ID: " + user.getId() + ")");
        }
    }
}
