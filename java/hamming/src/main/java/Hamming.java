public class Hamming {
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("strands must be of equal length");

        for(int i=0; i<leftStrand.length(); i++){
            if (leftStrand.charAt(i) != rightStrand.charAt(i))
                hammingDistance++;
        }

    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
