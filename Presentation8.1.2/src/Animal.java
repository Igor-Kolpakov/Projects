public class Animal {
    String name;
    String color;
    double weight;

    public Animal () {
        name = "���";
        color = "�����";
        weight = 2.5;
    }

    public Animal (String name){
        this.name = name;
    }

    public Animal (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal (String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public void run() {
        System.out.println("�������� �����");
    }

    public void run(int speed) {
        System.out.println("�������� ����� �� ���������: " + speed);
    }

}
