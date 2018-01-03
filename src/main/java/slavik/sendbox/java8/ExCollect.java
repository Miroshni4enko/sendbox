package slavik.sendbox.java8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExCollect {
    Stream<String> stream = Stream.empty();
    HashSet<String> result = stream.collect(HashSet::new, HashSet::add, HashSet::addAll);
    List<String> stringList = stream.collect(Collectors.toList());
    Set<String> stringSet = stream.collect(Collectors.toSet());
    TreeSet<String> stringTreeSet = stream.collect(Collectors.toCollection(TreeSet::new));
    String resultString = stream.collect(Collectors.joining());

    private Stream<Object> streamObjects;
    String resultStringWithSeparatorForAnyObject = streamObjects.map(Object::toString).collect(Collectors.joining(", "));

}
