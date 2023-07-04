import java.util.Scanner;

public class Movie {
    /*5. �������� ����� 'Movie'. ��������� ������ Movie ������������ �����. ���� ����� ����� ��������� ��� ���������� ������:
        title, �������, �������� �������, ��������������, �������� ������
        studio, �������, �������� �������, �������������� ������, ������� �����
        rating, ������� ������������ ����� ������, ������������ ������� ������ (��������, PG13, R � �.�.).
     1) �������� ����������� ��� ������ Movie, ������� ��������� � �������� ���������� ������, �������������� �������� ������, ������, �������������� ������, � ������, �������������� �������, � ������������� ��������������� ���������� ������ � ��� ��������.
     2) �������� ������ ����������� ��� ������ Movie, ������� ��������� � �������� ���������� ������, �������������� �������� ������, � ������, �������������� ������, � ������������� ��������������� ���������� ������ � ��� ��������, � ���������� ������ rating ������������� � �������� "PG".
     3) �������� ���������� ������ Movie � ��������� "�����", ������� "RatPac-Dune Entertainment" � ��������� "R" � � ��������� "������� �����" � ������� "20th Century Studios"
     */

    String title;
    String studio;
    String rating;

    /*
    //1)
    public Movie() {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �������� ������: ");
        title = in.nextLine();
        System.out.println("������� �������� ������: ");
        studio = in.nextLine();
        System.out.println("������� ���������� ������� ������: ");
        rating = in.nextLine();
    }
     */
    //1)
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    //2)
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    //3)

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
