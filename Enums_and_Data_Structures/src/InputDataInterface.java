import java.util.Scanner;

public interface InputDataInterface {
    //���� ������ ��������
    static int optionInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���������������� ����� ��������: ");
        int optionNumber = in.nextInt();
        return optionNumber;
    }

    static String contactNameAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ��� ��������: ");
        String name = in.nextLine();
        return name;
    }

    static String contactNumberAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        String number = in.nextLine();
        return number;
    }

    static String colorAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���������������� ����: ");
        String color = in.nextLine();
        return color;
    }

    static String fruitAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ������: ");
        String fruit = in.nextLine();
        return fruit;
    }

    static String linkedListAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �����������: ");
        String sentence = in.nextLine();
        return sentence;
    }

    static int indexNumberInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �����: ");
        int indexNumber = in.nextInt();
        return indexNumber;
    }

    static String gemsInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ���������: ");
        String gemsName = in.nextLine();
        return gemsName;
    }

    static String animal () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������� �������: ");
        String animalName = in.nextLine();
        return animalName;
    }

    static String animalAction () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ���������: ");
        String animalAction = in.nextLine();
        return animalAction;
    }
}
