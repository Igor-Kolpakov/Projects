import java.util.LinkedList;

public class LinkedListTasks {
    /*9. �������� ��������� ��� ��������� ������� � ���������� ��������� ��������� ��������� � ������� ������.
      10. �������� ��������� ��� ������ ���� ��������� � ������� ������.
     */
    private LinkedList<String> elements = new LinkedList<>();

    public String  linkedListInput () {
        return String.valueOf(elements.add(InputDataInterface.linkedListAdd()));
    }

    public void linkedListOutput () {
        for (String output : elements) {
            System.out.println(output);
        }
    }

    public void showFirstAndLastElement() {
        System.out.println(elements.peekFirst());
        System.out.println(elements.peekLast());
    }

    public void linkedListUpdateUserInfo () {
        int numberOfUpdates = InputDataInterface.indexNumberInput();
        for (int i = 0; i<numberOfUpdates; i++) {
            int indxNum = InputDataInterface.indexNumberInput();
            elements.set(indxNum, InputDataInterface.linkedListAdd());
        }
    }
}
