public class Enums {

    public enum Colors {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE
    }

    public enum Weekdays {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public void isWeekday() {
        for (Weekdays weekdays : Weekdays.values()) {
            if (weekdays != Weekdays.SATURDAY && weekdays != Weekdays.SUNDAY) {
                System.out.println("������� ����: " + weekdays);
            } else {
                System.out.println("��������: " + weekdays);
                break;
            }
        }
    }

    public void isHoliday() {
        for (Weekdays weekdays : Weekdays.values()) {
            if (weekdays == Weekdays.SATURDAY && weekdays == Weekdays.SUNDAY) {
                System.out.println("��������: " + weekdays);
            } else {
                System.out.println("������� ����: " + weekdays);
                break;
            }
        }
    }
}
