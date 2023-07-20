import java.util.Scanner;

public class Number_of_1bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc .nextInt();
        System.out.println(numone(num));
    }
    public static int numone(int a)
    {
        int val = 0;
        while(a!=0)
        {
            if((a&1)==1)
            {
                val++;
            }
            a = a >> 1;
        }
        return val;
    }
}