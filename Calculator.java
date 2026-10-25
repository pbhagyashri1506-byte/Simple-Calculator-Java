import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== SIMPLE CALCULATOR ===");
        System.out.print("Pahili sankhya taka: ");
        double num1 = scanner.nextDouble();
        System.out.print("Dusri sankhya taka: ");
        double num2 = scanner.nextDouble();
        System.out.println("Operation select kara (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result = 0;
        boolean valid = true;
        switch(operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if(num2 != 0) result = num1 / num2; 
                else { System.out.println("Error: Zero ne bhagakar hot nahi!"); valid = false; }
                break;
            default: System.out.println("Chukicha operator!"); valid = false;
        }
        if(valid) System.out.println("Uttar: " + result);
        scanner.close();
    }
}
