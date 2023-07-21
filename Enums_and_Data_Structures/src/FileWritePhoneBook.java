import java.util.HashMap;
import java.util.Map;

public class FileWritePhoneBook {
    //������ ��� ����������� ����� ������ � ����������� ����������� ������ � ����
    private HashMap<String, String> userInputAndSaveInFilePhoneBook = new HashMap<>();

    //����� ��������� �� ������������ ���� � ������� ������
    public void allContactsFromUserInputMapWithSaveOutput () {
        for (Map.Entry<String, String> entry : userInputAndSaveInFilePhoneBook.entrySet()) {
            System.out.println(entry);
        }
    }

    //����� �� ����� ��������
    public void contactNameSearchInFileInputPhoneBook() {
        //System.out.print("������� ��� �������� ��������: ");
        String informationGet = userInputAndSaveInFilePhoneBook.get(InputDataInterface.contactNameAdd());
        System.out.println(informationGet);
    }

    //������ �������� � ������������ ���� � ����������� � ������
    public String newContactWriteInFutureFileMap() {
        return userInputAndSaveInFilePhoneBook.put(InputDataInterface.contactNameAdd(), InputDataInterface.contactNumberAdd());
        //System.out.println("����� ������� ��������");
    }

    //����� �������� �� �����
    public void contactInformationUpdateInCashPhoneBook () {
        String forNameCheck = InputDataInterface.contactNameAdd();
        if (userInputAndSaveInFilePhoneBook.containsKey(forNameCheck) == true) {
            userInputAndSaveInFilePhoneBook.put(forNameCheck, InputDataInterface.contactNumberAdd());
        } else {
            System.out.println("������ �������� �� ����������");
        }
    }
}
