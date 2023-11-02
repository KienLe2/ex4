import java.util.Scanner;

public class RectangleArea {
    int L,W,Area; // declearing Length Width Area
    void getdata(){ // Method of getdata
        Scanner input = new Scanner(System.in); // Scanner for input the number
        System.out.println("Enter the length: ");
        L = input.nextInt();
        System.out.println("Enter the width: ");
        W = input.nextInt();
    }
    void computeField() { // Method of computeField performs computation.
        Area = L * W;
    }
    void fieldDisplay() { // Method Printing result
        System.out.println("Your Result: " + Area);
    }
}
