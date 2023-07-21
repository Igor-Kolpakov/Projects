public class Students {
    /*4. �������� ����� Student � ����� grade ���� int.
    ����� �������� ��������� ����������� ������ ������ � �������� �� � ���������.
    ����� ��������� �������� �� ������ ������ (��������� foreach ��� iterator) � ��������, ��� ����� �������� � ����������.

     */
    private int grade;
    private String name;

    public Students() {

    }

    public Students(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student: " +
                "���='" + name + '\'' + " " +
                "grade=" + grade;
    }
}
