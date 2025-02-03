import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        
        System.out.println("Enter your name: ");
        String userName = myObj.nextLine();
        System.out.println("Your name is: " + userName);
        
        System.out.println("Enter your age: ");
        int userAge = myObj.nextInt();
        System.out.println("Your age is " + userAge);
        
        System.out.println("Are you student?");
        boolean userCond = myObj.nextBoolean();
        System.out.println(userCond);
        
        System.out.println("Are you male(m) or female(f)?");
        char userGender = myObj.next().charAt(0);
        System.out.println("Your gender starts with " + userGender);
    }
}
