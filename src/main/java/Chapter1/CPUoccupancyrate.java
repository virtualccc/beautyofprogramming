package Chapter1;

import java.util.Scanner;

/**
 * 输入cpu执行时钟周期t GHZ
 * t*2/5
 */
public class CPUoccupancyrate {
    public static void main(String[] args) {
        System.out.println("请输入计算机CPU GHZ");
        Scanner sc = new Scanner(System.in);
        long busyloop  = (long)Float.parseFloat(sc.nextLine())*1000000000*2/5;
        for (int i = 0 ; i< busyloop;i++) {
            ;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
