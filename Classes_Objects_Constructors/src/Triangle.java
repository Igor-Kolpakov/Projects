import java.util.Scanner;

public class Triangle {
    /*2. �������� ����� � ������ 'Triangle' � �������������, ����������� �������� ����� ����� ������ ������������.
        �������� ��������� ��� ������ ������� � ��������� ������������ �� ��������� 3, 4 � 5 ������.
    */
    int a;
    int b;
    int c;
    int Perimeter;
    double Square;

    public Triangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������� a: ");
        a = in.nextInt();
        System.out.print("������� ������� b: ");
        b = in.nextInt();
        System.out.print("������� ������� c: ");
        c = in.nextInt();
        //in.close();
    }


    int returnPerimeter(){
        Perimeter = a + b + c;
        return Perimeter;
    }

    double returnSquare(){
        Square = Math.sqrt(Perimeter * (Perimeter - a) * (Perimeter - b) * (Perimeter - c));
        return Square;
    }
}
