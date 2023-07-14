import java.util.Scanner;

public class StarTriangle {
    /*2. �������� ����� StarTriangle, ������� ����� ������������ ��� ��������� ���������� ������������.
        [*]
        [*][*]
        [*][*][*]
        [*][*][*][*]

        ��� ����� ������ ����� ����������� � ���������� width, ������� ��������� �� ���������� [*] � ��������� ������ ������������.
        ����� ����, ������ ���� ����� toString(), ������� ��������� ������, �������������� �����������, � ���������� ������, ��������� �� [*] � �������� ����� ������.

        ������������� ������:
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());

        �������� ������:
        [*]
        [*][*]
        [*][*][*]
     */

    /*
    System.out.print("������� ������ ���������: ");
        int i1 = in.nextInt();
        for (int i2 = 0; i2 <= i1; i2++) {
            for (int j = 0; j <= i2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
     */
    private int width;

    public StarTriangle () { }

    public StarTriangle(int width) {
        this.width = width;
    }

    public int starLimitInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������ ���������: ");
        width = in.nextInt();
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "[*]";
    }
}

   /*public void starsMakingProcess() {
        for (int i2 = 0; i2 <= this.width; i2++) {
            for (int j = 0; j <= i2; j++) {
                System.out.print("*");
            }
        }
    }*/
