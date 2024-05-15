import java.util.ArrayList;
import java.util.List;

class KindergartenGarden {
    final private String[] rows;

    KindergartenGarden(String garden) {
        this.rows = garden.split("\n");
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> plants = new ArrayList<>();

        int index = 2 * (student.charAt(0) - 'A');
        for (String row : rows) {
            plants.add(Plant.getPlant(row.charAt(index)));
            plants.add(Plant.getPlant(row.charAt(index + 1)));
        }

        return plants;
    }

}
