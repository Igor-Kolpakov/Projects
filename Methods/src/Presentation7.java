public class Presentation7 {

    static void printHelloWorld() {
        System.out.println("������, ���!");
    }

    static void printHello() {
        System.out.println("������, ���!");
    }

    static void printHello(String name) {
        System.out.println("������, " + name + "!");
    }

    static void printHello(String name, int age) {
        System.out.println("������, " + name + "! �������:" + age);
    }


    static void printHelloPersonAndAge (String name, int age) {
        System.out.println("������, " + name + "! �������: " + age);
    }

    static String getHelloWorld() {
        return "������, ���!";
    }

    static int getSumOfTwoNums(int x, int y) {
        return x + y;
    }

    static double getSumOfTwoNums(double x, double y) {
        return x + y;
    }

    static float getSumOfTwoNums(float x, float y) {
        return x + y;
    }

    static void checkAge(int age) {
        if (age < 21) {
            System.out.println("������ ��������!");
        } else {
            System.out.println("������ ��������!");
        }
    }

    static int getSum(int x) {
        if (x > 0) {
            return x + getSum(x -1);
        } else {
            return 0;
        }
    }

    static int getSum1(int start, int end) {
        if (end > start) {
            return end + getSum1(start, end - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        printHelloWorld();
        printHello("����");
        printHello("���������");
        printHello("������");
        printHello();
        printHello("�����");
        printHello("������", 24);
        printHelloPersonAndAge("������", 25);
        printHelloPersonAndAge("�����", 25);
        printHelloPersonAndAge("������", 25);
        // ����� ������ � println()
        System.out.println(getHelloWorld());
        //���������� ���������� � strHelloWorld
        String strHelloWorld = getHelloWorld();
        //����� ����������
        System.out.println(strHelloWorld);

        int x = 2, y = 5;
        int sum = getSumOfTwoNums(x, y);
        System.out.println(x + "+" + y + "=" + sum);

        int age = 25;
        checkAge(age);

        System.out.println(getSumOfTwoNums(1, 2));
        System.out.println(getSumOfTwoNums(2.5, 8.2));
        System.out.println(getSumOfTwoNums(10f, 19.2f));


        int sum1 = getSum(10);
        System.out.println(sum1);

        int sum2 = getSum1(5, 10);
        System.out.println(sum2);
    }
}
