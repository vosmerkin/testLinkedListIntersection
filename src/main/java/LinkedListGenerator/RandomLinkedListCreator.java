package LinkedListGenerator;

import java.util.LinkedList;
import java.util.List;

public class RandomLinkedListCreator {

    public List<Integer> createList(int size) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(RandomInt.randInt(1,100));
        }
        return list;
    }

}
