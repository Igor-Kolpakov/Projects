public class Students {
    /*1. ���������� ����� Student. ������� ����� ���, id � ��� ��������.
    ������������ ����������� � ����� ����������� � �������� ������ ��� ������� � �����, id � ���������� ���� ��������.
    */

    private String name;
    private int id;
    private int learningYear;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLearningYear(int learningYear) {
        this.learningYear = learningYear;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void learningYearIncrease () {
        while (learningYear <= 11) {
            learningYear++;
            System.out.println(learningYear);
        }
    }
}
