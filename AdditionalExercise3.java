import java.util.Scanner;

public class AdditionalExercise3 {
    public static void main(String[] args) {
        /*1: �������� ���������, ����� ��������� �������� ����� � ������ ��������������.
        � ����������, �������� �� �� ���������� ��� ���.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("������� �����: ");
        int length = in.nextInt();
        System.out.print("������� ������: ");
        int width = in.nextInt();
        System.out.print("������� ����������: ");
        int hypotenuse = in.nextInt();
        if ((hypotenuse * hypotenuse) == ((length * length) + (width * width))) {
            System.out.println("�����: ������������� ");
        } else if ((hypotenuse * hypotenuse) < ((length * length) + (width * width))) {
            System.out.println("�����: ������������� ");
        } else if ((hypotenuse * hypotenuse) > ((length * length) + (width * width))) {
            System.out.println("�����: ������������ ");
        }
        /*2:������� ����������� ������ � 10%, ���� ��������� ���������� ������ ����� ������ 5000.
        ���� ��������� ������ ���� 5000, �� ��������� �������� ��� ���������.
        ��������� � �������� �������� ��������� ������� ��� ������������.
         */
        System.out.print("������� ����: ");
        double price = in.nextDouble();
        if (price > 5000) {
            double newprice = price * 0.9;
            System.out.println("����� ����: " + newprice);
        } else {
            System.out.println("���� �������� �������");
        }
        /*3:� ������������ ���������� ��������� ������� ��� ������� ������:
        ���� 25 - F
        �� 25 �� 45 - E
        �� 45 �� 50 - D
        �� 50 �� 60 - C
        �� 60 �� 80 - B
        ���� 80 - A
        �������� ���������� grade � ����������� � ������� ��������������� ������ � ����������� �� �������� ����������.
        */
        System.out.print("������� ����: ");
        int grade = in.nextInt();
        if (grade < 25) {
            System.out.println("���� ������: F ");
        } else if (grade >= 25 && grade <= 45) {
            System.out.println("���� ������: E ");
        } else if (grade >= 45 && grade <= 50) {
            System.out.println("���� ������: D ");
        } else if (grade >= 50 && grade <= 60) {
            System.out.println("���� ������: C ");
        } else if (grade >= 60 && grade <= 80) {
            System.out.println("���� ������: B ");
        } else if (grade > 80) {
            System.out.println("���� ������: A ");
        }

        /*4:���� ����� ������������� �����. �������� ���������, ������� ������� ��� ����� � �������� �������.
        ��������, ���� ���� ����� 12345, �� ����� ����� ���������: 54321.
        */
        System.out.print("������� �����: ");
        int a = in.nextInt();
        int b;
        while (a>0) {
            b = a%10;
            a /=10;
            System.out.print(b);
        } System.out.println(" ����������");
        /*5. ���� ����� ������������� �����.
        �������� ���������, ������� ������� ��������� � ���, �������� �� ��� ����� �������.
         */

        System.out.print("������� �����: ");
        int chislo = in.nextInt();
        for(int i=2; i<=Math.sqrt(chislo); i++){
        if(chislo%i==0) {
            System.out.println("����� ���������");
        }
        System.out.println("����� �������");
        }

        /*
        6. �������� ��������� ��� ������ ���������� ���������:

        i)
        **********
        **********
        **********
        **********
         */

        System.out.print("������� �����: ");
        int x = in.nextInt();
        for (int y= 0; y<=x; y++ ) {
            System.out.print("*");
        } System.out.println();
        for (int z= 0; z<=x; z++ ) {
            System.out.print("*");
        } System.out.println();
        for (int c= 0; c<=x; c++ ) {
            System.out.print("*");
        } System.out.println();
        for (int v= 0; v<=x; v++ ) {
            System.out.print("*");
        }
            System.out.println();


        /*
        6:�������� ��������� ��� ������ ���������� ���������:

        ii)
        *
        **
        ***
        ****
        *****
         */

        System.out.print("������� ������ ���������: ");
        int i1 = in.nextInt();
        for (int i2 = 0; i2 <= i1; i2++) {
            for (int j = 0; j <= i2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*
        6:�������� ��������� ��� ������ ���������� ���������:
        iii)
                1
              212
            32123
          4321234
        543212345
         */
        System.out.print("������� ������ ��������� �����: ");
        int predel = in.nextInt();
        for (int i2 = 1; i2 <= predel; i2++) {
            for (int j = 1; j <= i2; j++) {
                System.out.print(" " + j + "" + j);
            }
            System.out.println(); // �� ���� ��� ����������� ��������� � ���������� ����� ��������.
        } System.out.println();

        /*
        7:���� ��� ����� ����� a � b.
        �������� ��������� ��� ���������� ����� ����������� ����� � ��������� �� a �� b.
         */
        System.out.print("������� ������ �����: ");
        int a1 = in.nextInt();
        System.out.print("������� ������ �����: ");
        int b1 = in.nextInt();
        int pow = 2;
        int sum;
        if (b1>0) {
            sum =(int)((Math.pow(b1, pow))/2) - (b1/2);
            System.out.print(sum);
        } else System.out.println("������");
        System.out.println();

        /*
        8:� �������� ������ ���������� �� ������������ � ������� �����������.
        ���� �������� � ����� ����������.
        �������� ���������, ����� ���������� ����� ������ � ����������� �� ������ ����������.
        ���������� ������� ���������� �� ��������� �������� ����������;
        ������� � ������� �������������� �������� � �������.

        ������ � ����������� �� ������:

        ����� A: 50%
        ����� B: 25%
        ����� C: 0%
         */
        System.out.print("������� ���� ��������: ");
        int salary = in.nextInt();
        double resultSalary;
        if (salary>0 && salary<=250000) {
            resultSalary = salary;
            System.out.print("��� ����� C: " + resultSalary);
        } else if (salary>250000 && salary<=500000) {
            resultSalary = (salary * 1.25);
            System.out.print("��� ����� B: " + resultSalary);
        } else if (salary>500000 && salary<=1000000) {
            resultSalary = (salary * 1.5);
            System.out.print("��� ����� A: " + resultSalary);
        } System.out.println();

        /*
        ���� ����� ������������� ����� n. �������� ��������� ��� ������ ���� ��������� �� n ������:

        0 1 1 2 3 5 8 13 21 .....
         */
        int f1 = 0;
        int f2 = 1;
        System.out.print("������� ����� n: ");
        int n = in.nextInt();
        for (int k = 0; k < (n - 2); k++ ) {
            int fSum;
            fSum = f1 + f2;
            f1 = f2;
            f2 = fSum;
            System.out.print(" " + f2 + " ");
        } System.out.println();
        in.close();

    }

}
