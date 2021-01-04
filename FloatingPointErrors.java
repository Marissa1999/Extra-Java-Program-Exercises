// This program demostrates that floating-point oprations produce approximations
// to the real results.

// For example, it compares 0.3, 3*0.1, and 0.1+0.1+0.1
/*
It turns out that:
 3: false       0.3  <>  0.1 + 0.1 + 0.1

 3: false       0.3  <>  3*0.1

 3:  true     3*0.1  ==  0.1 + 0.1 + 0.1

Run this program and find out more.
*/
public class FloatingPointErrors {

    public static void main(String[] args) {
        double[] sum1
                = {
                    0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0
                };
        String[] text_sum_1
                = {
                    "0.0", "0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9", "1.0"
                };
        double[] sum2 = {
            0.0,
            0.1,
            0.1 + 0.1,
            0.1 + 0.1 + 0.1,
            0.1 + 0.1 + 0.1 + 0.1,
            0.1 + 0.1 + 0.1 + 0.1 + 0.1,
            0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1,
            0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1,
            0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1,
            0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1,
            0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1};


        String[] text_sum_2 = {
            "0.0",
            "0.1",
            "0.1 + 0.1",
            "0.1 + 0.1 + 0.1",
            "0.1 + 0.1 + 0.1 + 0.1",
            "0.1 + 0.1 + 0.1 + 0.1 + 0.1",
            "0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1",
            "0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1",
            "0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1",
            "0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1",
            "0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1"};
 
        double[] sum3
                = {
                    0.0, 
                    1 * 0.1, 
                    2 * 0.1, 
                    3 * 0.1, 
                    4 * 0.1, 
                    5 * 0.1, 
                    6 * 0.1, 
                    7 * 0.1, 
                    8 * 0.1, 
                    9 * 0.1, 
                    10 * 1.0
                };

        String[] text_sum_3
                = {
                    "0.0", "1*0.1", "2*0.1", "3*0.1", "4*0.1", "5*0.1", "6*0.1", "7*0.1", "8*0.1", "9*0.1", "10*1.0"
                };
        for (int k = 1; k < sum1.length; k++) {
            boolean sum_1_equals_sum_2 = (sum1[k] == sum2[k]);
            String result_12 = (sum_1_equals_sum_2 ? " == " : " <> ");
            System.out.printf("%2d: %5b   %7s %4s %s%n%n", k, sum_1_equals_sum_2, text_sum_1[k], result_12, text_sum_2[k]);

            boolean sum_1_equals_sum_3= (sum1[k] == sum3[k]);
            String result_13 = (sum_1_equals_sum_3 ? " == " : " <> ");
            System.out.printf("%2d: %5b   %7s %4s %s%n%n", k, sum_1_equals_sum_3, text_sum_1[k], result_13, text_sum_3[k]);

            boolean sum_3_equals_sum_2 = (sum3[k] == sum2[k]);
            String result_32 = (sum_3_equals_sum_2 ? " == " : " <> ");
            System.out.printf("%2d: %5b   %7s %4s %s%n%n", k, sum_3_equals_sum_2, text_sum_3[k], result_32, text_sum_2[k]);
            System.out.printf("\n==================================================================================\n");
        }

    }

}
