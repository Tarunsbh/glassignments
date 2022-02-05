import java.util.Scanner;

public class CodingChallenge3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = num.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = num.nextInt();
        System.out.println("Select required operation");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        int op = num.nextInt();
        switch(op){
            case 1: System.out.print(num1+num2);
            break;
            case 2: System.out.print(num1-num2);
            break;
            case 3: System.out.print(num1*num2);
            break;
            case 4: 
                if (num2 == 0) {
                    System.out.println("Cannot be divided");
                } else {
                    System.out.println(num1/num2);
                    }
                    break;         

                }
        num.close();       
        }
    }
