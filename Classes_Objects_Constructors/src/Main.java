public class Main {

    public static void main(String[] args) {

        //������ ������.
        Students studentAlice = new Students();
        studentAlice.name = "�����";
        studentAlice.surname = "����";
        studentAlice.address = "������ - 2";
        studentAlice.id = 24;
        System.out.println(studentAlice);

        Students studentAzamat = new Students();
        studentAzamat.name = "������";
        studentAzamat.surname = "�������";
        studentAzamat.address = "������ - 1";
        studentAzamat.id = 17;
        System.out.println(studentAzamat);

        Students studentKristina = new Students();
        studentKristina.name = "��������";
        studentKristina.surname = "�������";
        studentKristina.address = "��������� 83";
        studentKristina.id = 12;
        System.out.println(studentKristina);
        System.out.println();

        //������ ������.
        Triangle triangle = new Triangle();
        System.out.println("��������: " + triangle.returnPerimeter());
        System.out.println("�������: " + triangle.returnSquare());

        //������ ������.
        Rectangle rectangle = new Rectangle();
        System.out.println("������� ������� �������������� = " + rectangle.returnFirstSquare());
        System.out.println("������� ������� �������������� = " + rectangle.returnSecondSquare());

        //��������� ������.
        Average average = new Average();
        System.out.println("������� �������������� = " + average.numAverageCalculation());

        //����� ������
        Movie movie = new Movie("�����", "RatPac-Dune Entertainment", "R");
        Movie movie1 = new Movie("������� �����", "20th Century Studios");
    }
}
