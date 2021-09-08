import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int max = Math.max(a, Math.max(b,c));
        int min = Math.min(a, Math.min(b, c));
        int median = a + b  + c - max - min;
        return median;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        } else {
            return b;
        }

    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double mult = (a*a) + (b*b);
        double ans = Math.sqrt(mult);
        return ans;

    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0
////
        Scanner scan = new Scanner(System.in);
        System.out.print("Pick number a: ");
        int a = Integer.parseInt(scan.next());

        System.out.print("Pick number b: ");
        int b = Integer.parseInt(scan.next());

        System.out.print("Pick number c: ");
        int c = Integer.parseInt(scan.next());

        scan.close();

        System.out.println("The median is " + median(a,b,c));
        System.out.println("The greater absolute value of a and b is " + magnitude(a,b));
        System.out.println("The hyp of your triangle is " + pythagoras(a,b));







    }
}
