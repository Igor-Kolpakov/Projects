import java.util.HashMap;
import java.util.Map;


public class PhoneBook implements InputDataInterface {
    /*5. �������� ���������� ����������, �������������� ������� ���������� �����, ���������� ������ ����� ������� � ����������� ��������.
    ��������� ���������, ����� ��������� ������ ����� ������������ ��� ����� ���� ����������.
    � ������� ���� ������������ ����� ����������� �������� ����� �������, ����������� ��� ��������, �������� ���������� � ���������� �������� � ��������� ����� ��������� �� �����.
    ���������: ����������� Scanner, while(true), switch-case.
     */

    //������ �� ������������ ������� ��������� �������������
    private HashMap<String, String> staticPhoneBookCreation() {
        HashMap<String, String> staticPhoneBook = new HashMap<>();
        staticPhoneBook.put("�������� ��������� ���������", "+78092234596");
        staticPhoneBook.put("������� ������ ����������", "+79015455636");
        staticPhoneBook.put("���������� ����� �����������", "+75053698547");
        staticPhoneBook.put("������ ��������� ���������", "+78094879685");
        staticPhoneBook.put("������� ������� ������������", "+79012563215");
        staticPhoneBook.put("�������� ����� ��������", "+75054231563");
        return staticPhoneBook;
    }

    //����� ���� ��������� �� ����������� ����
    public void allContactsFromStaticMapOutput () {
       for (Map.Entry<String, String> entry : staticPhoneBookCreation().entrySet()) {
           System.out.println(entry);
       }
    }

    //����� �� ����� ��������
    public void contactNameSearchInStaticPhoneBook() {
        //System.out.print("������� ��� �������� ��������: ");
        String informationGet = staticPhoneBookCreation().get(InputDataInterface.contactNameAdd());
        System.out.println(informationGet);
    }

    //������ �������� � ����������� ���������� �����
    public String newContactWriteInStaticMap () {
        return staticPhoneBookCreation().put(InputDataInterface.contactNameAdd(), InputDataInterface.contactNumberAdd());
    }

    //���������� �������� ��� ������������� ��������
    public void contactInformationUpdateInStaticPhoneBook () {
        String forNameCheck = InputDataInterface.contactNameAdd();
        //boolean nameCheck = userInputPhoneBook.containsKey(contactNameAdd()); //nameCheck == true
        if (staticPhoneBookCreation().containsKey(forNameCheck) == true) {
             staticPhoneBookCreation().put(forNameCheck, InputDataInterface.contactNumberAdd());
        } else {
            System.out.println("������ �������� �� ����������");
        }
    }
}
