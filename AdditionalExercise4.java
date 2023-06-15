import java.lang.reflect.Array;
import java.util.*;

public class AdditionalExercise4 {
    public static void main(String[] args) {
        /*1. ��� ������ �����. �������� ��������� ��� ���������� �������� �������� ��������� ����������� �������.
        ����:
        [1, 3, 4, 1, 5, 5]

        �����:
        ������� �������� = 3.16666667
         */
        double average = 0;
        int sum = 0;
        int[] myInt = {1, 3, 4, 1, 5, 5};
        for (int num : myInt) {
            sum += num;
            average = (double) sum / myInt.length;
        }
        System.out.println("������� �������� = " + average);

        /*2. ��� ������ ����� ��������. �������� ��������� ��� ������ ���������� ��������.

        ����:
        [1, 3, 4, 1, 5, 5]

        �����:
        ��������� = 1, 5
         */
        int[] myInt2 = {1, 3, 4, 1, 5, 5};
        for (int i = 0; i < myInt2.length; i++) {
            for (int j = i + 1; j < myInt2.length; j++) {
                if (myInt2[i] == myInt2[j]) {
                    System.out.println("��������� = " + myInt2[j]);
                }
            }
        }
        System.out.println();

        /*3. ��� ������ ����� ��������. �������� ��������� ��� ��������, �������� �� ������ ������������ ��������.
        1)
        ����:
        [1, 3, -6, 23, 14, 2]
        int x = 23

        �����:
        True

        2)
        ����:
        [1, 3, -6, 23, 14, 2]
        int x = 0

        �����:
        False
        */
        int x1 = 0;
        int x = 23;
        int[] myInt3 = {1, 3, -6, 23, 14, 2};
        for (int num1 : myInt3) {
            if (num1 == x) {
                System.out.println("����� " + x + " ���� � ������� myInt3");
            } /* if (num1 == x1) {
                System.out.println("����� " + x1 + "��� � ������� myInt3");
            } */
        }
        System.out.println();

        /*4. ��� ������ ����� ��������. �������� ��������� ��� ���������� ������� �������� �������.
        1)
        ����:
        [1, 3, -6, 23, 14, 2]
        int x = 23

        �����:
        ������ = 3

        2)
        ����:
        [1, 3, -6, 23, 14, 2]
        int x = 5

        �����:
        �� �������

         */
        int index = 0;
        int x3 = 23;
        int x4 = 5;
        for (int i1 = 0; i1 < myInt3.length; i1++) {
            if (myInt3[i1] == x3) {
                index = i1;
            }
            /* if (myInt3[i1] == x4 ) {
                index = i1;
            }*/
        }
        System.out.println("������ ��������: " + index);
        System.out.println();

        /*5. ���� ������ ����� �������� � ����� ����� n, m.
        �������� ��������� ��� ���������� ���������� ����� ��������� n � m.
        1)
        ����:
        [34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7]
        int n = 3
        int m = 8

        �����:
        [30, 25, 40, 32, 31, 35]

        2)
        ����:
        [1, 3, -6, 23, 14, 2]
        int n = 1
        int m = 3

        �����:
        [3, -6, 23]
         */
        int n = 3;
        int m = 8;
        int[] myInt4 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        for (int i2 = 0; i2 < myInt4.length; i2++) {
            if (i2 >= n && i2 <= m) {
                System.out.println("�����: " + myInt4[i2]);
            }
        }
        System.out.println();

        /*6. ��� ������ ����� ��������.
        �������� ��������� ��� ���������� ����������� � ����������� ��������� �������.

        ����:
        [1, 3, -6, 23, 14, 2]

        �����:
        ����������� ������� = -6
        ������������ ������� = 23
         */
        Integer[] myInt5 = {1, 3, -6, 23, 14, 2}; //����� ���� ������� ����� ������� ����� Math.min(), �� � �������� ��� ��������� ������ ��� �� ���� ��� �����
        List<Integer> ints = Arrays.asList(myInt5);
        System.out.println("����������� ������� = " + Collections.min(ints));
        System.out.println("������������ ������� = " + Collections.max(ints));
        System.out.println();

        /*7. ��� ������ ����� ��������.
        �������� ��������� ��� ���������� ����������� � ������� ����������� ��������� ��������� �������.

        ����:
        [1, 3, -6, 23, 14, 2]

        �����:
        ���������� ������� = -6
        ������ ���������� ������� = 1
         */
        int min = 1000;  //����� ��� ����������� ���� ����� min ����� Scanner, ����� ������������ ��� ������������ ������� ������� ���� �����.
        int min2 = 1000;
        int[] myInt6 = {1, 3, -6, 23, 14, 2};
        for (int i5 = 0; i5 < myInt6.length; i5++) {
            min = Math.min(myInt6[i5], min);
        }
        for (int j5 = 0; j5 < myInt6.length; j5++) {
            if (min < myInt6[j5] && myInt6[j5] < min2) {
                min2 = Math.min(myInt6[j5], min2);
            }
        }
        System.out.println("���������� ������� = " + min);
        System.out.println("������ ���������� ������� = " + min2);
        System.out.println();

        /*8. ��� ������ ����� ��������.
        �������� ��������� ��� ������������ ����������� ����� �� ��������� ������� ����� ��������������� �����.

        ����:
        [1, 2, 3, 0, 4, 6]

        �����:
        643210

         */
        int[] myInt7 = {1, 2, 3, 0, 4, 6};  //���� ��� ���� �������� ������ � ������, ����� � ������� charAt ����������� ������.
        System.out.print("���� �����: ");
        for (int i3 = myInt7.length - 1; i3 >= 0; i3--) {
            System.out.print(myInt7[i3]);
        } System.out.println();

        /*9. ��� ��������� ������ ����� ��������.
        �������� ��������� ��� ������ ������� ����� ��������� ����� � �������� ��������� ���������� �������.

        1)

        ����:
        10 20 30
        40 50 60

        �����: ����� ��������� ����� � �������� ���������� �������
        10 40
        20 50
        30 60

        2)
        ����:
        4 2 1
        2 7 2

        �����: ����� ��������� ����� � �������� ���������� �������
        4 2
        2 7
        1 2

         */
        int[][] myDoubleInt = {{10, 20, 30}, {40, 50, 60}};  //�� ������� ������ �� ������� ������ 0-�� � 1-�� ������ � �������.
        int[][] myNewDoubleInt = new int[myDoubleInt.length][myDoubleInt.length];
         for (int i4 = 0; i4 < myDoubleInt.length; i4++) {
            for (int j4 = 0; j4 < myDoubleInt.length; j4++) {
                myNewDoubleInt[j4][i4] = myDoubleInt[i4][j4];
            }
        }
        System.out.println("��� �������������� ������: ");
        Arrays.stream(myNewDoubleInt).map(Arrays::toString).forEach(System.out::println);
        System.out.println();


        /*10. �������� ���������, ������� ���������� ����� ���� �������� � ��������� �������.
        ����:
        10 20 30
        40 50 60

        �����:
        ����� = 210
        */
        int[][] myDoubleInt3 = {{10, 20, 30}, {40, 50, 60}};
        int sum1 = 0;
        for(int[] row : myDoubleInt3)
        {
            for(int element : row)
                sum1 += element;
        } System.out.println("�����: " + sum1);

        /*11. �������� ���������, ������� ���������� true, ���� ��������� ������ �������� ����������.
        (!) ��������� ������ ��������� ����������, ���� ���������� ����� ����� ����� ������ ������.
        ����� ������������, ��� ������ ������ ���������� ������� ����� ���������� ���������� ��������.
        1)
        ����:
        10 20 30
        40 50 60

        �����: false

        2)
        ����:
        10 20
        40 50

        �����: true

         */
        int[][] myDoubleInt4 = {{10, 20, 30}, {40, 50, 60}};
        for (int[] arr : myDoubleInt4) {
            if (myDoubleInt3.length == arr.length) {
                 System.out.println("��� ������ ����������");
             } else {
                System.out.println("��� ������ �� ����������");
            }
        } System.out.println();

        /*12. ���� ����� ����� n.
        �������� ���������, ������� ���������� ��������� ������, �������������� ������� ���������.
        ����� n ���������� ������ ������� ���������.

        ����: n = 5;

        �����:
        [1,  2,  3,  4,  5]
        [2,  4,  6,  8, 10]
        [3,  6,  9, 12, 15]
        [4,  8, 12, 16, 20]
        [5, 10, 15, 20, 25]

         */
        int n1 = 5; //�� ������� ������ �� �������� �� ������� �����, �� ��������� ������� ������ ������������ ������
        int[][] multiplicationTable = new int[n1][n1];
        for(int multiplier = 1; multiplier <= n1; multiplier++) {
            for (int k = 0; k < n1; k++) {
            for (int[] row : multiplicationTable) {
                for (int element : row) {
                    element = (int) Math.pow(multiplier, 2);
                    row[k] = element;

                }
            }
            }
        }
        Arrays.stream(multiplicationTable).map(Arrays::toString).forEach(System.out::println);
        System.out.println();



        /*13. �������� ���������, ������� ���������� ������������ � ����������� ��������, ��������� � ��������� �������.
        ����:
        10 20 30
        40 50 60

        �����:
        ������������ ������� = 60
        ����������� ������� = 10
         */

        int[][] myDoubleInt5 = {{10, 20, 30}, {40, 50, 60}};
        int min1 = 1000;
        int max1 = 0;
        for (int i6 = 0; i6 < myDoubleInt5.length; i6++) {
            for (int j6 = 0; j6 <= myDoubleInt5.length; j6++){
                min1 = Math.min(myDoubleInt5[i6][j6], min1);
                max1 = Math.max(myDoubleInt5[i6][j6], max1);
            }
        }
        System.out.println("��� ����������� �������: " + min1);
        System.out.println("��� ������������ �������: " + max1);
    }
}
