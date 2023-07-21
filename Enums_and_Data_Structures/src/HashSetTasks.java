import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HashSetTasks {
    /*11. �������� ��������� ��� ��������� ���� HashSet � ���������� ���������, ���������� � ����� HashSet.
      12. �������� ��������� ��� �������� ����, �������� �� HashSet ������ ��� ���.
     */
   private HashSet<String> annaGems = new HashSet<>();
   private HashSet<String> irinaGems = new HashSet<>();
   private ArrayList<String> forDuplicates = new ArrayList<>();


    public String hashSetInputForAnna () {
        return String.valueOf(annaGems.add(InputDataInterface.gemsInput()));
    }

    public void hashSetOutputForAnna () {
        for (String out : annaGems) {
            System.out.println(out);
        }
    }

    public void hashSetCheckForAnna () {
        if (annaGems.isEmpty()) {
            System.out.println("��������� ������");
        } else {
            System.out.println("� ��������� ���-�� ����");
        }
    }

    public String hashSetInputForIrina () {
        return String.valueOf(irinaGems.add(InputDataInterface.gemsInput()));
    }

    public void hashSetOutputForIrina () {
        for (String out : irinaGems) {
            System.out.println(out);
        }
    }

    public void duplicatesOutput () {
        for (String dup : forDuplicates) {
            System.out.println(dup);
        }
    }

    public void twoHashSetsCheck () {
        for (String anna : annaGems) {
            for (String irina : irinaGems) {
                if (Objects.equals(anna.toLowerCase(), irina.toLowerCase())) {
                    forDuplicates.add(anna);
                }
            }
        }
    }

}
