import java.util.Scanner;

public class inherit {
    public static void main(String[] args) {
        A a = new A();
        a.getRateofInterest();
        a.setter();

    }
}

abstract class Bank {
    float amount;
    float i;
    float total_i;
    float month;
    final float interest = 8.9f;
    float j;
    float year;
    Scanner scanner = new Scanner(System.in);

    abstract public void getRateofInterest();

    abstract public void setter();
}

class A extends Bank {

    public void getRateofInterest() {
        System.out.print("Ebter Month EMI = ");
        amount = scanner.nextFloat();
        System.out.print("enter how Manny Years EMI Interest = ");
        j = scanner.nextFloat();
        i = amount * interest / 100;
        month = amount + i;
        year = month * 12;
        total_i = i * 12;
        j = j * year;

    }

    public void setter() {
        System.out.println("Monthly Interest Amount = " + month);
        System.out.println("year Interest Amount = " + year);
        System.out.println("One Year Interest onluy = " + total_i);

        System.out.println("Your Home Loan Total Year Amount = " + j);

    }

}
