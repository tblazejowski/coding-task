package pl.falcor;

import java.util.HashSet;
import java.util.Objects;

class VowelsWithLength {

    private HashSet<Character> vowelsSet;
    private Integer wordLength;

    VowelsWithLength(HashSet<Character> vowelsSet, Integer wordLength) {
        this.vowelsSet = vowelsSet;
        this.wordLength = wordLength;
    }

    HashSet<Character> getVowelsSet() {
        return vowelsSet;
    }

     Integer getWordLength() {
        return wordLength;
    }

    @Override
    public String toString() {
        return "(" + vowelsSet + ", " + wordLength + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VowelsWithLength that = (VowelsWithLength) o;
        return Objects.equals(getVowelsSet(), that.getVowelsSet()) &&
                Objects.equals(getWordLength(), that.getWordLength());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVowelsSet(), getWordLength());
    }
}