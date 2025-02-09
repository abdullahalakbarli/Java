public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        Student student1 = new Student(1, "Abdulla", "AAbaku2006", "abdullahalakbarli077@gmail.com", 770000000, 18, 98, 3, "İDP163i");
        Teacher teacher1 = new Teacher(2, "Rakib", "refendi1961", "refendiyev@beu.edu.az", 100000000, 64, 5000, "Math");

        userService.add(student1);
        userService.add(teacher1);
        userService.getAll();
        userService.update(1, "Abdullah");
        userService.getAll();
        userService.delete(2);
        userService.getAll();
    }
}
