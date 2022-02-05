import java.util.Scanner;

class Main {

//performAddition method
public int performAddition(int num1, int num2) {
    return num1+num2;

}

//main method
public static void main(String[] args) {

//create object of main class
Main main = new Main();
int num1,num2,result;

//take input of num1, num2
Scanner num = new Scanner(System.in);
System.out.print("Enter number one: ");
num1 = num.nextInt();
System.out.print("Enter number two: ");
num2 = num.nextInt();
num.close();


//call performAddition method and store result in a variable
result = main.performAddition(num1,num2);

//display the result.
System.out.print("Total of "+ num1+" and "+num2 +" is "+ result);
}
}
