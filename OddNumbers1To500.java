
/**
 * prints the odd numbers from 1 to 500
 * @author Suyash Patel
 */
public class OddNumbers1To500 {
    /**
     * number 500 for not getting magic number checkstyle error
     */
    public static final int FIVE_HUNDRED = 500;

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 500: ");
        for (int i = 1; i <= FIVE_HUNDRED; i += 2) {
            System.out.println(i);
        }
    }
}
