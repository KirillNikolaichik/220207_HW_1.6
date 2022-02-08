public class HelloWorld6 {
public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    int min = 0;
    int max = 0;
/*
    if((a>b) | (a>c)) max = a;
    if((b>a) | (b>c)) max = b;
    if((c>b) | (c>a)) max = c;

    if((a<b) | (a<c)) min = a;
    if((b<a) | (b<c)) min = b;
    if((c<b) | (c<a)) min = c;
*/

    if (a>b) {
        max = a;
    } else {
        max = b;
    }
    if (max<c) {
        max = c;
    }

    if (a<b) {
        min = a;
    } else {
        min = b;
    }
    if (min>c) {
        min = c;
    }
    System.out.println("Наименьшее число "+ min);
    System.out.println("Наибольшее число "+ max);


}
}
