import java.util.ArrayList;
import java.util.Objects;

public class ArrayListTasks {
    /*6. �������� ��������� ��� �������� ������ ������ ArrayList, ���������� ��������� ������ (String) � ������ ��������� �� ������.
      7. �������� ��������� ��� ��������� ���� ArrayList �������.
      8. �������� ��������� ��� ������ ������� �������� ������ ArrayList �� ��������� �������.
     */
    private ArrayList<String> colors = new ArrayList<>(); //6-�� ������
    private ArrayList<String> colorsForCheck = new ArrayList<>(); //7-�� ������
    private ArrayList<String> fruits = new ArrayList<>(); //8-�� ������

    public String colorsInputInArrayList () {
        return String.valueOf(colors.add(InputDataInterface.colorAdd()));
    }

    public String colorsForCheckInput () {
        return String.valueOf(colorsForCheck.add(InputDataInterface.colorAdd()));
    }

    public void twoArrayListCheck () {
        for (String color : colors) {
            for (String colorDuplicate : colorsForCheck) {
                if (Objects.equals(color.toLowerCase(), colorDuplicate.toLowerCase())) {
                    System.out.println(color + " " + colorDuplicate + " True ");
                } else {
                    System.out.println(color + " " + colorDuplicate + " False ");
                }
            }
        }
    }

    public void colorsOutput () {
        for (String color : colors) {
            System.out.println(color);
        }
    }

    public String fruitsInputInArrayList () {
        return String.valueOf(fruits.add(InputDataInterface.fruitAdd()));
    }

    public void fruitsOutput () {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void fruitReplace () {
        String forCheck = InputDataInterface.fruitAdd();
        int indexForCheck = fruits.indexOf(forCheck);
        if (fruits.contains(forCheck)) {
            fruits.set(indexForCheck, InputDataInterface.fruitAdd());
            System.out.println("������ ���� �����������");
        } else {
            System.out.println("������ ������ � ��� ���");
        }
    }
}