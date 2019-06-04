package Chapter1;

/**
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * 两者不相对立，则不能在同一列
 * 1 4 7 %3 =1
 * 2 5 8 %3 =2
 * 3 6 9 %3 =0
 */
public class chess {

    public static void main(String[] args) {
        int a =1 ;
        int b =1;
        for (a=1;a<=9;a++)
            for (b=1;b<=9;b++)
                if(a%3 != b%3)
                {
                    System.out.printf("A = %d ,B = %d",a,b);
                    System.out.println();}

    }
}
