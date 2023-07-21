import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        /*
        //1. �������� ��������� ������������ Colors � ����������� ������. �������� �������� ������������ Colors �� ������.
        for (Enums.Colors colors : Enums.Colors.values()) {
            System.out.println(colors);
        }

        /*2. �������� ��������� ������������ Weekday � ����������� ��� MONDAY, TUESDAY,... �� SUNDAY.
        ������������ ������ ����� ����� ���������� boolean isWeekDay() � ����� ���������� boolean isHoliday().
        ����� isHoliday() ������ ���������� ��������, ��������������� isWeekDay().
        �������� ���������, ��������������� ������������� ����� ������������, � ������� ���� �����, ����������� � �������� ��������� Weekday � ���������� ��������� � ����������� �� ����, �������� �� ���� Weekday ����������� ��� ���.
        ���������: ����� main ����� ���������� ��� �������� � ������������ Weekday � ���������� �� � �������� ��������� ������.
        *--/
        Enums weekDays = new Enums();
        weekDays.isWeekday();
        weekDays.isHoliday();


        //4-�� ������
        Students studentAnna = new Students(5, "����");
        //studentAnna.setGrade(5);
        //System.out.println("����: " + studentAnna.getGrade());

        Students studentIgor = new Students(3, "�����");
        //studentAnna.setGrade(3);
        //System.out.println("�����: " + studentAnna.getGrade());

        Students studentRita = new Students(4, "���������");
        //studentAnna.setGrade(4);
        //System.out.println("���������: " + studentAnna.getGrade());

        ArrayList<String> students = new ArrayList<>();
        students.add(studentAnna.toString());
        students.add(studentIgor.toString());
        students.add(studentRita.toString());
        //System.out.println(students);
        for (String student : students) {
            System.out.println(student);
        }
        */

        /*
        boolean close = false;
        CashPhoneBook cashPhoneBookOutput = new CashPhoneBook();
        while (!close) {
            InputDataInterface.phoneBookOptions();
            switch (InputDataInterface.optionInput()) {
                case (1) -> { cashPhoneBookOutput.allContactsFromCashMapOutput(); }
                case (2) -> { cashPhoneBookOutput.newContactWriteInEmptyCashMap(); }
                case (3) -> { cashPhoneBookOutput.contactInformationUpdateInCashPhoneBook();}
                case (4) -> { cashPhoneBookOutput.contactNameSearchInCashUserPhoneBook(); }
                case (5) -> { close = true; }
            }
        }*/

        /*
        ArrayListTasks colors = new ArrayListTasks();
        boolean close = false;
        while (!close) {
            InformationOutputInterface.colorOptions();
            switch (InputDataInterface.optionInput()) {
                case (1) -> { colors.colorsInputInArrayList(); }
                case (2) -> { colors.colorsOutput(); }
                case (3) -> { colors.colorsForCheckInput(); }
                case (4) -> { colors.twoArrayListCheck();}
                case (5) -> { close = true; }
            }
        } */

        /*
        LinkedListTasks element = new LinkedListTasks();
        boolean close = false;
        while (!close) {
            InformationOutputInterface.linkedLisOption();
            switch (InputDataInterface.optionInput()) {
                case (1) -> { element.linkedListInput(); }
                case (2) -> { element.linkedListOutput(); }
                case (3) -> { element.showFirstAndLastElement(); }
                case (4) -> { element.linkedListUpdateUserInfo();}
                case (5) -> { close = true; }
            }
        } */

        /*
        HashSetTasks gems = new HashSetTasks();
        boolean close = false;
        while (!close) {
            InformationOutputInterface.hashSetOptions();
            switch (InputDataInterface.optionInput()) {
                case (1) -> { gems.hashSetInputForAnna(); }
                case (2) -> { gems.hashSetOutputForAnna(); }
                case (3) -> { gems.hashSetInputForIrina(); }
                case (4) -> { gems.hashSetOutputForIrina(); }
                case (5) -> { gems.hashSetCheckForAnna(); }
                case (6) -> { gems.twoHashSetsCheck(); gems.duplicatesOutput();}
                case (7) -> { close = true; }
            }
        } */

        HashMapTasks animals = new HashMapTasks();
        boolean close = false;
        while (!close) {
            InformationOutputInterface.hashMapOption();
            switch (InputDataInterface.optionInput()) {
                case (1) -> { animals.animalsAndActionsInput(); }
                case (2) -> { animals.animalsAndActionOutput(); }
                case (3) -> { animals.animalsAndActionCheck(); }
                case (4) -> { animals.backingUpAnimals(); }
                case (5) -> { close = true; }
            }
        }
    }
}
