import java.util.Scanner;

public class Temperature {
    /*9. �������� ����� Temperature, ������� ����� ��� ����: �������� ����������� (double) � ������ �����, ���� 'C' ��� �������, ���� 'F' ��� ����������.
        ���������, ��� ������ � ���� ���� ����� �������� ������ ����� ������-��������� (get/set) ��� ������.

        ������������:
        ����� ������ ����� ������ ������������:
        ���� ��� ������� ���� ���������� (�����������, ���� ��������, ���� �������� �� �������, � �������, ���� ����� �� �������)
        ���� � ����� ����������� ��� ���� ���������� ����������
        ����������� �� ��������� (��������������� �� ���� �������� �������).

        ������:
        ��� ������ ��� �������� �����������: ���� ��� �������� �������� �� �������, ������ ��� �������� �������� �� ����������.
        ��� �������������� ����������� ��������� �������:
        degreesC = 5(degreesF - 32) / 9
        degreesF = (9(degreesC/5) + 32

        ��� ������ ��� ��������� �����: ���� ��� ��������� ��������, ���� ��� ��������� ����� ('F' ��� 'C'), � ���� ��� ��������� �����.
        ����� ��� �������� �����.
     */
    Scanner in = new Scanner(System.in);
    private double degrees;
    private String degreesType;


    public Temperature () {

    }
    public Temperature(double degrees) {
        this.degrees = degrees;
    }

    public Temperature (String degreesType) {
        this.degreesType = degreesType;
    }

    public Temperature (double degrees, String degreesType) {
        this.degreesType = degreesType;
        this.degrees = degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public void setDegreesType(String degreesType) {
        this.degreesType = degreesType;
    }

    public double getDegrees() {
        return degrees;
    }

    public String getDegreesType() {
        return degreesType;
    }

    public double degreesUserInput () {
        System.out.print("������� �������: ");
        degrees = in.nextDouble();
        return degrees;
    }

    public String degreesUserTypeInput () {
        System.out.print("������� ��� ��������: ");
        degreesType = in.next();
        return degreesType;
    }

    public void degreesConvertToFahrenheit () {
        double degreesF;
        degreesF = (((9 * degrees) / 5) + 32);
        System.out.println(degreesF);
    }

    public void degreesConvertToCelsius () {
        double degreesC;
        degreesC = ((degrees - 32) * 5) / 9;
        System.out.println(degreesC);
    }
}




/* ����, ������������ ������ ����������� � ��������, ����� �������� ��� ��������, � �����, � ����� � ��
 */