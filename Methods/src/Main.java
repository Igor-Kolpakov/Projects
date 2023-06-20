import java.util.Scanner;
public class Main {

    static int task1 () {
        /*1. �������� ����� ��� ���������� ����������� ����� ����� ���� �����.
        ����:
        ������ �����: 25
        ������ �����: 37
        ������ �����: 29

        ��������� ���������: ���������� ��������: 25
         */
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        int a = in.nextInt();
        System.out.print("������� ������ �����: ");
        int b = in.nextInt();
        System.out.print("������� ������ �����: ");
        int c = in.nextInt();
        int endNum;
        endNum = Math.min((Math.min(a, b)), c);
        in.close();
        return endNum;

    }
    static double task2 () {
        /*2. �������� ����� ��� ���������� �������� �������� ���� �����.
        ����:
        ������ �����: 25
        ������ �����: 45
        ������ �����: 65

        ��������� ���������: ������� �������� 45,0
        */
        Scanner in1 = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        int a1 = in1.nextInt();
        System.out.print("������� ������ �����: ");
        int b1 = in1.nextInt();
        System.out.print("������� ������ �����: ");
        int c1 = in1.nextInt();
        double endNum1;
        endNum1 = (a1 + b1 + c1) / 3;
        in1.close();
        return endNum1;
    }

    static int task3 () {
        /*
        �������� ����� �������� ���� ������� ���� � ������.

        ����: DarTech123

        ��������� ���������: ���������� ������� � ������: 2
        */
        Scanner in2 = new Scanner(System.in);
        System.out.print("������� ���� ������: ");
        String str = in2.nextLine();
        int endResult = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( str.toLowerCase().charAt(i) == 'a'
                    /* && str.toLowerCase().charAt(i) == 'e'
                     && str.toLowerCase().charAt(i) == 'i'
                      && str.toLowerCase().charAt(i) == 'o'         //��� ������� ������ �� �� ��������� ��� �������.
                       && str.toLowerCase().charAt(i) == 'u'
                        && str.toLowerCase().charAt(i) == 'y' */) {
                endResult++;
            }
        }
        in2.close();
        return endResult;
    }

    static int task4() {
        /*4. �������� ����� ��� �������� ���� ���� � ������.
        ����: ������� ������: Java is good to learn Object Oriented programming.

        ��������� ���������: ���������� ���� � ������: 8
        */
        Scanner in3 = new Scanner(System.in);
        System.out.print("������� ���� ������: ");
        String str = in3.nextLine();
        int counter = 0;
        if (str.length() != 0) {
            counter++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    counter++;
                }
            }

        }
        in3.close();
        return counter;
    }

    static int task5() {

        /*5. ���� ����� ��������������� �����. �������� ����� ��� �������� ���������� ���� �����, ������� �������� 2.
        ����: 1254212

        ��������� ���������: 3
         */
        Scanner in4 = new Scanner(System.in);
        System.out.println("������� ���� �����: ");
        int a = in4.nextInt();
        int counter = 0;
        String str =String.valueOf(a);
        for (int i =0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == '2') {
                counter++;
            }
        }
        in4.close();
        return  counter;
    }

    static boolean task6 () {
        /*6. �������� �����, ������� ���������, ��� �� ������� � �������� ������ �������� �������� (a, e, i, o, u) ��� ���.
        ������� true, ���� ������ ������ ������ �������� �������, ����� ������� false.
        ����: AIEEE

        ��������� ���������: true
         */
        Scanner in5 = new Scanner(System.in);
        System.out.print("������� ���� ������: ");
        String str = in5.nextLine();
        char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u', y = 'y';                //System.out.print("������� ����� ��� ��������: "); String substr = in5.nextLine();
        boolean b = true;
        boolean b1 = false;
        boolean status;
        if (str.toLowerCase().contains(String.valueOf(a))                         //�� ������� ������ �� �� ��������� ��� ������� � ���������.
               /* && str.toLowerCase().contains(String.valueOf(e))
                && str.toLowerCase().contains(String.valueOf(i))
                 && str.toLowerCase().contains(String.valueOf(o))
                  && str.toLowerCase().contains(String.valueOf(u))
                   && str.toLowerCase().contains(String.valueOf(y)) */ ){         //str.toLowerCase().contains(substr.toLowerCase())
            status = b;                                                           //substr.toLowerCase().matches(str.toLowerCase())
        } else {                                                                  //str.toLowerCase().indexOf(substr.toLowerCase()) != -1
            status = b1;
        }
        in5.close();
        return status;

    }


    static double task7() {
        /*7. �������� ����� ��� ����������� ������� �������������.
        ����:
        ���������� ������: 5
        ����� �������: 6

        ��������� ���������: ������� ������������� ����� 61,937
         */
        Scanner in6 = new Scanner(System.in);
        System.out.println("������� ����� ������� ����������� �������������: ");
        int a = in6.nextInt();
        final int n = 5;
        final double Pi = 3.14;
        double square;
        square = ((Math.pow(a, 2)) / 4) * (Math.sqrt(25 + (10 * (Math.sqrt(5)))));
        //square = (n / 4) * (Math.pow(a, 2)) * (1 / (Math.tan((Pi / n))));   ������� ������������ �����������
        in6.close();
        return square;
    }

    static int task8() {
        /*8. �������� ����� ��� ���������� ����� ���� ������ �����.
        ����: 252

        ��������� ���������: ����� = 9
         */
        Scanner in7 = new Scanner(System.in);
        System.out.print("������� ���� �����: ");
        int a = in7.nextInt();
        int b;
        int sum = 0;
        while (a>0) {
            b = a % 10;
            a /= 10;
            sum += b;
        }
        return sum;
    }



    public static void main (String[] args) {
        //System.out.println("���������� ��������: " + task1());
        //System.out.println("������� �������� " + task2());
        //System.out.println("���������� ������� � ������: " + task3());
        //System.out.println("���������� ���� � ������: " + task4());
        //System.out.println(task5());
        //System.out.println(task6());
        //System.out.println("������� ������������� ����� " + task7());
        System.out.println("����� = " + task8());
    }

}
