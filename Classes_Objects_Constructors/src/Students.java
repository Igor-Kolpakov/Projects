public class Students {
    /*1. �������� ����� � ������ 'Student' �� ���������� ����������� name, surname, address � ������������� ���������� id.
    ����� Student ����� ����� toString() ��� ������ ���������� � ��������.
    �������� ������ ������ Student, ��������� �������� name - "�����", surname - "����", address - "������-2", id - 24.
    �������� ��� ��� ������� ������ Student.
    ��������� ��������������� �����, �������, ��� � ����� ���� ��������� � ������� "������" � "��������" ��������������.
    �������� ���������� � ��������� � ������� ������ toString().

     */
    String name;
    String surname;
    String address;
    int id;


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }


}
