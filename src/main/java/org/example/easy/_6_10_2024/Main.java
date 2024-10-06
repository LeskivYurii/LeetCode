package org.example.easy._6_10_2024;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        Deque<String> words1 = Arrays.stream(sentence1.split(" ")).collect(Collectors.toCollection(ArrayDeque::new));
        Deque<String> words2 = Arrays.stream(sentence2.split(" ")).collect(Collectors.toCollection(ArrayDeque::new));
        while (!words1.isEmpty() && !words2.isEmpty() && words1.getFirst().equals(words2.getFirst())) {
            words1.removeFirst();
            words2.removeFirst();
        }

        while (!words1.isEmpty() && !words2.isEmpty() && words1.getLast().equals(words2.getLast())) {
            words1.removeLast();
            words2.removeLast();
        }

        return words1.isEmpty() || words2.isEmpty();
    }

    //Sentence Similarity III

}
