package pl.falcor.vowels;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.HashSet;

public class VowelsMap {

    private HashMap<String, Integer> wordsMap;
    private HashMap<VowelsWithLength, VowelsStats> vowelsMap = new HashMap<>();

    public VowelsMap(HashMap<String, Integer> wordsMap) {
        this.wordsMap = wordsMap;
    }

    public HashMap<VowelsWithLength, VowelsStats> getStats() {
        int counter = 0;
        for (String word : wordsMap.keySet()) {
            HashSet<Character> vowelsInWord = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                if (VowelsSet.VOWELS_SET.contains(word.charAt(i))) {
                    vowelsInWord.add(word.charAt(i));
                    counter++;
                }
            }
            VowelsWithLength vowelsWithLength = new VowelsWithLength(vowelsInWord, word.length());
            if (vowelsMap.containsKey(vowelsWithLength)) {
                vowelsMap.get(vowelsWithLength).increaseOccurrence();
                vowelsMap.get(vowelsWithLength).setSum(counter);
            } else {
                vowelsMap.put(vowelsWithLength, new VowelsStats(
                        new BigDecimal(1).setScale(4, RoundingMode.HALF_EVEN),
                        new BigDecimal(counter).setScale(4, RoundingMode.HALF_EVEN)));
            }
            counter = 0;
        }
        return vowelsMap;
    }
}