/**
* p can be computed using the following formula:
* p = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
* Write a program that displays the result of 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
* and 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
*
* @author Ravi Lamontagne
*/

public class ApproximatePie {
    public static void main (String[] args){
        System.out.println(4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.println(4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));
    }
}
