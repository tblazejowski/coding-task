package pl.falcor.vowels;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class VowelsSet {

    private static final Character[] VOWELS = new Character[]{'a', 'e', 'i', 'o', 'u', 'y'};
    final static Set<Character> VOWELS_SET = new HashSet<>(Arrays.asList(VOWELS));
}