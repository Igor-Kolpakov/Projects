public class Presentation5_1 {
    public static void main (String[] args) {
        if (30 > 10) {
            System.out.println("30 ������, ��� 10");
        }

        int x = 20;
        int y = 40;
        if (x < y)
            System.out.println(x + "������ " + y);

        int time = 20;
        if (time < 18) {
            System.out.println("������ ����!");
        } else {
            System.out.println("������ �����!");
        }

        int time1 = 20;
        if (time1 < 18) {
            System.out.println("������ ����!");
        } else if (time1 < 20) {
            System.out.println("������ ����!");
        } else {
            System.out.println("������ �����!");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("�����������");
            case 2:
                System.out.println("�������");
            case 3:
                System.out.println("�����");
            case 4:
                System.out.println("�������");
            case 5:
                System.out.println("�������");
            case 6:
                System.out.println("�������");
            case 7:
                System.out.println("�����������");
                break;
        }

        String color = "Blue";
        switch (color) {
            case "Blue":
                System.out.println("�������");
                break;
            case "Black":
                System.out.println("������");
                break;
        }

        int day1 = 1;
        switch (day1) {
            case 6:
                System.out.println("������� �������");
                break;
            case 7:
                System.out.println("������� ����������");
                break;
            default:
                System.out.println("C ����������� ��� ��������");
        }

        String myNumber = "���";
        switch (myNumber) {
            case "����":
                System.out.println(1);
                break;
            case "���":
                System.out.println(2);
                break;
            case "���":
                System.out.println(3);
                break;
            default:
                System.out.println("�� �������");
        }
    }
}
