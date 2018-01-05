package slavik.sendbox.java8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SummaryStatistics {
    String contents;

    {
        try {
            contents = new String(Files.readAllBytes(Paths.get("somefile.zzz")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
    IntSummaryStatistics intSummaryStatistics = words.stream().collect(Collectors.summarizingInt(String::length));
    int max = intSummaryStatistics.getMax();
    int min = intSummaryStatistics.getMin();
    double average = intSummaryStatistics.getAverage();
}
