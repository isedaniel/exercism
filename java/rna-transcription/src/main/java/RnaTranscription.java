import java.util.Map;

class RnaTranscription {
    private Map<Character, Character> rna = Map.ofEntries(
            Map.entry('A','U'),
            Map.entry('C','G'),
            Map.entry('G','C'),
            Map.entry('T','A')
            );

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        for (char c : dnaStrand.toCharArray()) {
            sb.append(rna.get(c));
        }
        return sb.toString();
    }

}
