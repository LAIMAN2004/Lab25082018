package Lab25082018;

import java.util.Scanner;

public class Lab25082018 {
    public static void main(String[] args)
    {
        System.out.println("Введи очки всех игроков A - B - C");
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if ((a == b) & (b == c)) {
            System.out.println("Нечья");
        } else if ((a > b) & (a > c)) {
            if (b>c)
            System.out.println("Победил игрок А с разницей в очках с аутсайдером" + (a-c));
        } else if ((a > b) & (a > c)) {
            if (c>b)
            System.out.println("Победил игрок А с разницей в очках с аутсайдером" + (a-b));

        } else if ((b > a) & (b > c)) {
            if (a>c)
                System.out.println("Победил игрок Б с разницей в очках с аутсайдером" + (b-c));
        } else if ((b > a) & (b > c)) {
            if (c>a)
                System.out.println("Победил игрок Б с разницей в очках с аутсайдером" + (b-a));

        } else if ((c > b) & (c > a)) {
            if (b>a)
                System.out.println("Победил игрок С с разницей в очках с аутсайдером" + (c-a));
        } else if ((c > b) & (c > a)) {
            if (a>b)
                System.out.println("Победил игрок С с разницей в очках с аутсайдером" + (c-b));
    }}}









    /*{
        System.out.println("Введи три числа");
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if ((a == b + c) | (b == a + c) | (c == a + b))
            System.out.println("Трехугольник несуществует");
        else if ((a == b) & (a == c) & (b == c)) {
            System.out.println("Трехугольнок равносторонний");
        } else if ((a == b) | (a == c) | (c == b)) {
            System.out.println("Трехугольник равнобедренный");
        } else {
            System.out.println("Трехугольнник разносторонний");
        }
    }
}
*/



        /*System.out.println("Введи два числа");
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a==b) {
            System.out.println(a + " А = Б");
           if (a>b)
            System.out.println(" А больше Б");
        } else  {
            System.out.println(b + " Б больше А");
           }*/



        /*Scanner scanner = new Scanner(System.in);
        int i=99;
        System.out.println(i);
        System.out.println("Введите целое число");
        i = scanner.nextInt();
        System.out.println(i);*/

/*int i = 1;
int j = 3;
float f = 6/2;
char ch='3';
boolean b = true;
System.out.println(!((f==j)|!(ch==f)));*/


       /* Scanner scanner = new Scanner(System.in);
        int i=99, y=88;
        System.out.println(i + y);
        System.out.println("Введите целые числа");
        i = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(i==y);*/


