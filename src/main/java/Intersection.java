import LinkedListGenerator.RandomLinkedListCreator;

import java.util.List;

public class Intersection {


    public static void main(String[] args) {

        RandomLinkedListCreator listCreator1 = new RandomLinkedListCreator();
        List<Integer> list1 = listCreator1.createList(2000);
        System.out.println(list1);
        List<Integer> list2 = listCreator1.createList(200);
        System.out.println(list2);

        System.out.println("Max Intersection");
        System.out.println(new FindIntersections().findEqualValues(list1, list2));


    }
}
