import java.util.*;

public class pwd_gen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("\nThis is Password Generator (digit limit is 1 to 11.)\n");
        
        while (true) {
            int l = 1;
            System.out.print("Enter the length of password:\t");
            l = sc.nextInt();
            if (0 < l & l < 12) {
                    int j = 1;
                    for (int i = 0; i < l; i++) {
                        j *= 10;
                    }
                    System.out.print("Your generated password : \t");
                    int g = ran.nextInt(j);
                    System.out.println(g + "\n");
                }
            else {
                System.out.println("Please Enter Valid Length !!\n");
            }
        }
    }
}
