import java.util.Scanner;

public class Average {
    /*4. �������� ����� � ������ 'Average', ������� ����� ��� ���������� � ������ �������� ��������.
    �������� ���������, ����� ������� ������� �������� ���� �����.

    P.S. (�)�����, ������� �������� �� ����� ���� ������, ����� ����� ���-������ �������� ������� ��� ���� ���������
     */
    int n;
    int[] numArray;
    double numAverage;

    public Average() {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���������� ����� ����� ������������������ �����: ");
        n = in.nextInt();
        numArray = new int[n];
        System.out.println("������� �������� ����� ������������������ �����: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextInt();
        }
        System.out.print ("�������� ����� ������������������: ");
        for (int i = 0; i < n; i++) {
            System.out.print (" " + numArray[i]);
        } System.out.println();
    }

        public double numAverageCalculation() {
            for (int num : numArray) {
                int sum = 0;
                sum += num;
                numAverage = (double) sum / numArray.length;
            }
            return numAverage;
        }
}
