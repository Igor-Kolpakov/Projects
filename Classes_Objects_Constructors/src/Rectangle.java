import java.util.Scanner;

public class Rectangle {
    /*3. �������� ����� 'Rectangle' � ������ ����� � ������, ���������� � �������� ���������� ������������, � ������� 'returnArea', ������� ���������� �������.
    �������� ��������� ��� ������ ������� ���� ��������������� �� ��������� (5, 9) � (10, 14) ��������������.

     */
    int a;
    int b;
    int d;
    int e;
    double firstSquare;
    double secondSquare;

    public Rectangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ������� ��������������: ");
        a = in.nextInt();
        System.out.print("������� ������ ������� ��������������: ");
        b = in.nextInt();
        System.out.print("������� ����� ������� ��������������: ");
        d = in.nextInt();
        System.out.print("������� ������ ������� ��������������: ");
        e = in.nextInt();
        //in.close();
    }

    double returnFirstSquare(){
        firstSquare = a * b;
        return firstSquare;
    }

    double returnSecondSquare(){
        secondSquare = d * e;
        return secondSquare;
    }
}
