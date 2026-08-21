package Day_3;

public class WithMethod {
    public static void displayWelcome(){
        System.out.println("------------------------------");
        System.out.println("Welcome to java");
        System.out.println("------------------------------");
    }
    public static int CalculateTotal(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        displayWelcome();
        System.out.println("Your class is started");
        int total = CalculateTotal(5, 10);
        System.out.println("The total is: " + total);
    }
}
