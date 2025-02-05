public class UserService {
    public void add(User user) {
        System.out.println(user.getUsername()+" elave edildi");
    }

    public void delete(User user) {
        System.out.println(user.getUsername() + " silindi");
    }

    public void update(User user){
        System.out.println(user.getUsername() + "update edildi");
    }
}
