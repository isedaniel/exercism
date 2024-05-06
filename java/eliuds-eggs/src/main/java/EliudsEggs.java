public class EliudsEggs {
    public int eggCount(int number) {
        int eggs = 0;
        while (number > 0) {
            number &= (number - 1);
            eggs++;
        }
        return eggs;
    }
}
