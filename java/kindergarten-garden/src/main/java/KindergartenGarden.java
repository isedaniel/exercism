import java.util.ArrayList;
import java.util.List;

class KindergartenGarden {
    final private String row1;
    final private String row2;

    KindergartenGarden(String garden) {
        this.row1 = garden.split("\n")[0];
        this.row2 = garden.split("\n")[1];
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> plants = new ArrayList<>();
        int offset = student.charAt(0) - 'A';

        for (int i=offset; i<offset+2; i++) {
            plants.add(Plant.getPlant(row1.charAt(i)));
        }
        
        for (int i=offset; i<offset+2; i++) {
            plants.add(Plant.getPlant(row2.charAt(i)));
        }

        return plants;
    }

}
