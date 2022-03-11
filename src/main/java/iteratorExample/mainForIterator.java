package iteratorExample;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class mainForIterator {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("fsdfsd", "dsfsdfsdf", "dfsdfgdss");

        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
