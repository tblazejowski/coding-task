package pl.falcor;

import java.util.HashMap;
import java.util.HashSet;

class VowelsMap {

    private HashMap<String, Integer> wordsMap;
    private HashMap<VowelsWithLength, Integer> vowelsMap = new HashMap<>();

    VowelsMap(HashMap<String, Integer> wordsMap) {
        this.wordsMap = wordsMap;
    }

    HashMap<VowelsWithLength, Integer> createVowelsMap() {
        for (String word : wordsMap.keySet()) {
            HashSet<Character> vowelsInWord = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                if (VowelsSet.VOWELS_SET.contains(word.charAt(i))) {
                    vowelsInWord.add(word.charAt(i));
                }
            }
            VowelsWithLength vowelsWithLength = new VowelsWithLength(vowelsInWord, word.length());
            vowelsMap.put(vowelsWithLength, 1);
        }
        return vowelsMap;
    }
}