import java.util.Scanner;

public class Additionalexercise1 {
    public static void main(String[] args) {
        //1:�������� ��������� ��� ��������� 10 �� 5 � ������ ���������� � �������.
        int a = 10;
        int a1 = 5;
        int a2 = a * a1;
        System.out.println("10 * 5 = " + a2);
        // ���
        int a3 = 10;
        a3 = a3 * 5;
        System.out.println("10 * 5 = " + a3);
        // ���
        int a4;
        a4 = 10 * 5;
        System.out.println("10 * 5 = " + a4);
        // ���
        int a5 = 10;
        a5 *= 5;
        System.out.println("10 * 5 = " + a5);
        // ���
        System.out.println("10 * 5 = " + (10 * 5));


        //2:�������� ��������� ��� ������� 20 �� 2.5 � ������ ���������� � �������.
        int b = 20;
        double b1 = 2.5;
        double b2 = b / b1;
        System.out.println("20 / 2.5 = " + b2);
        // ���
        byte b3 = 20;
        double b4 = b3 / 2.5;
        System.out.println("20 / 2.5 = " + b4);
        // ���
        double b5;
        b5 = 20 / 2.5;
        System.out.println("20 / 2.5 = " + b5);
        // ���
        double b6 = 20;
        b6 /= 2.5;
        System.out.println("20 / 2.5 = " + b6);
        // ���
        System.out.println("20 / 2.5 = " + (20 / 2.5));


        /*3:����� � ������ �������������� ����� 15 � 9 ��������������.
        �������� ��������� ��� ���������� ������� � ��������� ��������������. */

        int length = 15;
        int width = 9;
        int perimeter = (length + width) * 2;
        int square = length * width;
        System.out.println("�������� ��������������: " + perimeter);
        System.out.println("������� ��������������: " + square);
        // ���
        int perimeter1 = (15 + 9) * 2;
        int square1 = (15 * 9);
        System.out.println("�������� ��������������: " + perimeter1);
        System.out.println("������� ��������������: " + square1);
        //���
        System.out.println("�������� ��������������: " + ((15 + 9) * 2));
        System.out.println("������� ��������������: " + (15 * 9));


        /*4:����������� ���������� ��������,
         ����� ��������� �������� ���������� x �� 1 � ������� ���������� � ����������� ����.
         �������� �� ����� ���������.
         */
        int x = 20;
        x++; // 20 + 1
        System.out.println("x + 1 = " + x); // 21

        ++x; // 21 + 1
        System.out.println("x + 1 = " + x); // 22


        //5:����������� �������� ������������ ��������, ����� �������� �������� 5 � ���������� x.

        x +=5;
        System.out.println("x1 + 5 = " + x);

        //6:�������� ��������� ��� �������� ��������� ���� ����� 25 � 43.

        int y = 25;
        int u = 43;
        System.out.println(y + "==" + u + ": " + (y == u));

        /*7:���� ��� ���������� a � b, �������� ������� ����� 10 � 5 ��������������.
         �������� ��������� ��� ��������, ���������, ���������, �������, ������� �� ������ ���� ����������.
        */

        int a7 = 10;
        int b7 = 5;
        System.out.println("��������: " + (a7 + b7));
        System.out.println("���������: " + (a7 - b7));
        System.out.println("���������: " + (a7 * b7));
        System.out.println("�������: " + (a7 / b7));
        System.out.println("������� �� ������: " + (a7 % b7));
        System.out.println("������� �� ������: " + (double)(b7 % a7));

        /*9:�������� ���������, ������� ���������� 10 � ����� 451, � ����� ����� ��� �� 3.
        ������ � ������ ���������� ������������ 5, � ����� ���������� �������� ���������� �� 5.
        �������� �� ����� ������������� ���������.
        */

        int j = 451;
        j %= (451+10)/3;
        j = (j+5)*5;
        System.out.println(j);

        /*10:���� ��� ���������� a � b, �������� ������� ����� 65 � 80 ��������������.
        �������� ���������, ����� ���������, ����� �� ��� ������� 'a < 50' � 'a < b'.
         */

        int a8 = 65;
        int b8 = 80;
        boolean p1 = (a8 < 50) && (a8 < b8);
        System.out.println("a8<50: " + (a8 < 50) + ", a8<b8: " + (a8 < b8) + ", ���������: " + p1);

        //8:�������� ��������� ��� �������������� �������� ���������� � ������� �������.
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Farenheit: ");
        double farenheit = in.nextDouble();
        farenheit = (int)((farenheit - 32) / 1.8);
        System.out.printf("Your Celsius: " + farenheit);
        in.close();


    }
}
