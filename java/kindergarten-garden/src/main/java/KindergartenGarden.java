import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KindergartenGarden {
    final private String[] rows;
    final private List<String> students;

    KindergartenGarden(String garden) {
        this.rows = garden.split("\n");
        this.students = Arrays.asList("Alice", "Bob", "Charlie",
            "David", "Eve", "Fred", "Ginny", "Harriet", 
            "Ileana", "Joseph", "Kincaid", "Larry");
    }

    KindergartenGarden(String garden, List<String> students) {
        this.rows = garden.split("\n");
        this.students = students;
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> plants = new ArrayList<>();

        int index = 2 * students.indexOf(student);
        for (String row : rows) {
            plants.add(Plant.getPlant(row.charAt(index)));
            plants.add(Plant.getPlant(row.charAt(index + 1)));
        }

        return plants;
    }

}
