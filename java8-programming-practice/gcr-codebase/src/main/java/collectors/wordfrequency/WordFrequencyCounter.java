package collectors.wordfrequency;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "Java is easy and Java is powerful";

        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                        .collect(Collectors.toMap(
                                word -> word,   // key
                                word -> 1,      // initial value
                                Integer::sum    // merge function
                        ));

        //  Display result
        wordCount.forEach((word, count) ->
                System.out.println(word + " : " + count)
        );
    }
}

