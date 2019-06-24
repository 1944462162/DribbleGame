import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("你需要抽取多少个数字");
        int k = in.nextInt();
        System.out.println("从多少个数字中抽取");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] =  i+1;
        }
        int[] result = new int[k];
        for(int i = 0; i < result.length; i++)
        {
            int r = (int)(Math.random()*k);
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        for (int results: result) {
            System.out.println(results);
        }
    }
}
