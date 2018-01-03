package slavik.sendbox.java8;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Words {
     void  findLongestWordsFromFile() throws IOException {
         String contents = new String(Files.readAllBytes(Paths.get("somefile.zzz")), StandardCharsets.UTF_8);
         List<String> words = Arrays.asList(contents.split("[\\P{L}]+")); // all non literal char as separator
         int count = 0;

         for (String s : words) {
             if (s.length() > 12) {
                count++;
             }
         }

         long count1 = words.stream().filter(s -> s.length() > 12).skip(1).
                 peek(p -> System.out.println("Element = " + p)).count(); // serial
         long count2 = words.parallelStream().filter(s -> s.length() > 12).skip(1).count(); // parallel

         Stream<String> song = Stream.of(contents.split("[\\P{L}]+")); // Stream.Of for arrays
         Stream<String> silence = Stream.empty(); // create stream without argume

         Arrays.stream(contents.split("[\\P{L}]+") ,0,10);// get elements from fixed bunch

         Stream<Double> generateRandom = Stream.generate(Math::random).limit(100);
         Stream<String> echos = Stream.generate(() -> "Echo");
         Stream<BigInteger> iterates = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
         Stream<String> uniqueWords = words.stream().distinct();
         Stream<String> longestFirst = words.stream().sorted(Comparator.comparing(String::length).reversed());

         Optional<String> max = words.stream().max(String::compareToIgnoreCase);
         if (max.isPresent()){
             System.out.println(max);
         }

         Optional<String> findFirst = uniqueWords.filter(w -> w.startsWith("Q")).findFirst();
         Optional<String> findAny = uniqueWords.filter(w -> w.startsWith("Q")).findAny();
         findFirst.ifPresent(words::add);

         String result = findAny.orElse("Something default value");
         String result1 = findAny.orElseGet(() -> {
             String s = "Execute if find nothing";
             System.out.println(s);
             return s;
         });
         String result3 = findAny.orElseThrow(NoSuchElementException::new);
         String result4 = findAny.orElseThrow(() -> new NoSuchElementException());



         boolean findAnyMach = words.parallelStream().anyMatch(w -> w.startsWith("Q")) ;
         boolean findNonoMach = words.parallelStream().noneMatch(w -> w.startsWith("Q")) ;
         boolean findAllMach = words.parallelStream().allMatch(w -> w.startsWith("Q")) ;
     }

     public static Optional<Double> inverseWithOfNullable(Double x) {
         return Optional.ofNullable(x);
     }

    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(1 / x);
    }

    public static Optional<Double> squareRoot(Double d){
         return d <= 0 ? Optional.empty() : Optional.of(Math.sqrt(d));
    }
    public static Optional<Double> inverseWithSqure(Double x) {
        return inverse(x).flatMap(Words::squareRoot);
    }

}
