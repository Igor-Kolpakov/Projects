import java.util.HashMap;
import java.util.Map;

public class CashPhoneBook {
    //������ ��� ������������� ���� ���������
    private HashMap<String, String> userInputPhoneBook = new HashMap<>();

    //����� ��������� �� ������������ ����
    public void allContactsFromCashMapOutput () {
        for (Map.Entry<String, String> entry : userInputPhoneBook.entrySet()) {
            System.out.println(entry);
        }
    }

    //����� �������� � ��� ����
    public void contactNameSearchInCashUserPhoneBook() {
        //System.out.print("������� ��� �������� ��������: ");
        String informationGet = userInputPhoneBook.get(InputDataInterface.contactNameAdd());
        System.out.println(informationGet);
    }

    //������ �������� � ������ ��� ����
    public String newContactWriteInEmptyCashMap() {
        return userInputPhoneBook.put(InputDataInterface.contactNameAdd(), InputDataInterface.contactNumberAdd());
        //System.out.println("����� ������� ��������");
    }

    //���������� �������� ��� ������������� ��������
    public void contactInformationUpdateInCashPhoneBook () {
        String forNameCheck = InputDataInterface.contactNameAdd();
        //boolean nameCheck = userInputPhoneBook.containsKey(contactNameAdd()); //nameCheck == true
        if (userInputPhoneBook.containsKey(forNameCheck) == true) {
            userInputPhoneBook.put(forNameCheck, InputDataInterface.contactNumberAdd());
        } else {
            System.out.println("������ �������� �� ����������");
        }
    }
}
