import java.util.Scanner;

public class Square {
    /*3. �������� ���������, ������� ��������� �������, �������� � ����� ��������� �������� �� �������� a.
         ������� ���� ��������� ������ ������� �� ����������������� ����� � ������� ������ Scanner.
     */
    private double a;
    private double perimeter;
    private double square;
    private double diagonal;

    public Square () { }

    public double sideInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������� ��������: ");
        a = in.nextDouble();
        return a;
    }
    public double perimeterCalculation() {
        perimeter = a * 4;
        return perimeter;
    }

    public double squareCalculation() {
        square = a * a;
        return square;
    }

    public double diagonalCalculation() {
        diagonal = Math.sqrt(2) * a;
        return diagonal;
    }
}
