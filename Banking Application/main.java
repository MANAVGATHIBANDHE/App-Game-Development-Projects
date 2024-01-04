import java.util.Scanner;

/**
 * get_data
 */
class get_data {
    Scanner scan = new Scanner(System.in);
    protected float principle_amount;
    protected float rate_of_interest;
    protected float duration;
    protected float interest;
    protected float total_interest;
    protected float total_amount;

    /*
     * main method
     */
    void data() {
        System.out.print("Enter Principle Amount :\t");
        principle_amount = scan.nextFloat();
        if (principle_amount > 0) {
            System.out.print("You want to Invest in Year's, Month's or Day's :\t");
            String c = scan.next();
            switch (c) {
                case "year":
                    System.out.print("Enter Time Duration in Year's :\t");
                    calculation();
                    break;
                case "month":
                    System.out.print("Enter Time Duration in Month's :\t");
                    calculation();
                    break;
                case "day":
                    System.out.print("Enter Time Duration in Day's :\t");
                    calculation();
                    break;
                default:
                    System.out.println("Please enter 'year' or 'month' or 'day'.\n\n");
                    break;
            }

        } else {
            System.out.println("Please Enter Valid Principle Amount.\n\n");
        }
    }

    /*
     * Calculation
     */
    void calculation() {
        duration = scan.nextFloat();
        if (duration > 0) {
            System.out.print("Set the Rate of Interest :\t");
            rate_of_interest = scan.nextFloat();
            if (rate_of_interest > 0) {
                interest = principle_amount * rate_of_interest / 100;
                total_interest = interest * duration;
                total_amount = principle_amount + total_interest;
                System.out.println("Pay-off Total Interest = " + total_interest);
                System.out.println("Pay-off Total Amount = " + total_amount);
                System.out.println("\n\n");
            } else {
                System.out.println("Please Enter Valid Rate of Interest.\n\n");
            }
        } else {
            System.out.println("Please enter valid Duration.\n\n");
        }

    }

}

public class main {
    public static void main(String[] args) {
        int i = 1;
        int id;

        /*
         * Object Building and Method Calling
         */
        while (i > 0) {
            id = i;
            get_data obj = new get_data();
            obj.data();
            i++;
        }
    }
}
