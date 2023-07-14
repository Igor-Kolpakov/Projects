public class Cat extends Animal implements Runnable, Swimmable {
    private String name = "�����";

    @Override
    public void animalSound1() {
        System.out.println("����� �������: ���-���");
    }

    @Override
    public void animalSound() {
        System.out.println("����� �������: ���-���");
    }


    public void sleep() {
        System.out.println("Zzzzzz");
    }

    public void run(int speed) {
        System.out.println("����� �� ���������: " + speed);
    }

    public void swim() {
        System.out.println("����� ����� �������!");
    }
}
