import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProteinTranslator {
    private Map<String, String> codons = Map.ofEntries(
            Map.entry("AUG", "Methionine"),
            Map.entry("UUU", "Phenylalanine"),
            Map.entry("UUC", "Phenylalanine"),
            Map.entry("UUA", "Leucine"),
            Map.entry("UUG", "Leucine"),
            Map.entry("UCU", "Serine"),
            Map.entry("UCC", "Serine"),
            Map.entry("UCA", "Serine"),
            Map.entry("UCG", "Serine"),
            Map.entry("UAU", "Tyrosine"),
            Map.entry("UAC", "Tyrosine"),
            Map.entry("UGU", "Cysteine"),
            Map.entry("UGC", "Cysteine"),
            Map.entry("UGG", "Tryptophan"),
            Map.entry("UAA", "STOP"),
            Map.entry("UAG", "STOP"),
            Map.entry("UGA", "STOP")
            );

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
        Matcher codon = Pattern.compile("\\w{1,3}").matcher(rnaSequence);
        while (codon.find()) {
            String protein = codons.get(codon.group());

            if (protein == null || protein.length() < 3)
                throw new IllegalArgumentException("Invalid codon");

            if (protein == "STOP")
                break;

            proteins.add(protein);
        }
        return proteins;
    }
}
