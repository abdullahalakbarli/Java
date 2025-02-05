public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Abdullah","1234","abdullahalakbarli077@gmail.com",770000000,18,98,3.5,"1161");
        Teacher teacher = new Teacher(2,"Ali","5678","ahasanov@beu.edu.az",550000000,45,2000,"Computer Science");
        Personal personal =  new Personal(3,"Cavid","91011","cavid@beu.edu.az.",880000000,30,500,"Human Resources");
        User[] users = {student,teacher, personal};
        UserService userService = new UserService();

        for(User user : users){
            userService.add(user);
        }
    }
}
