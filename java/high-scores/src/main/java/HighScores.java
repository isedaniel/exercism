import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class HighScores {
    private List<Integer> scores;
    private int[] sorted;

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
        int[] sort = highScores.stream().mapToInt(i->i).toArray();
        quickSort(sort, 0, sort.length - 1);
        this.sorted = sort;
    }

    List<Integer> scores() {
        return this.scores;
    }

    Integer latest() {
        return this.scores.get(this.scores.size() - 1);
    }

    Integer personalBest() {
        int best = 0;
        for (var score : this.scores) {
            if (score > best) best = score;
        }
        return best;
    }

    void quickSort(int[] arr, int start, int end) {
        // base case
        if (end <= start) return;

        int pivot = partition(arr, start, end); 
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++){
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    List<Integer> personalTopThree() {
        int[] topThree = new int[3];
        for (int i=this.sorted.length - 1, j=0; i > this.sorted.length - 4; i--){
            topThree[j] = this.sorted[i];
            j++;
        }
        return Arrays.stream(topThree).boxed().toList();
    }

}
