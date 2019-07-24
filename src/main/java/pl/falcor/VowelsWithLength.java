package pl.falcor;

import java.util.HashSet;

class VowelsWithLength {

    private HashSet<Character> vowelsSet;
    private Integer wordLength;

    VowelsWithLength(HashSet<Character> vowelsSet, Integer wordLength) {
        this.vowelsSet = vowelsSet;
        this.wordLength = wordLength;
    }

    public HashSet<Character> getVowelsSet() {
        return vowelsSet;
    }

    public Integer getWordLength() {
        return wordLength;
    }

    @Override
    public String toString() {
        return vowelsSet + " " + wordLength;
    }
}