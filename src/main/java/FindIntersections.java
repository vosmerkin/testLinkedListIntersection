import java.util.LinkedList;
import java.util.List;

public class FindIntersections {

    public List findEqualValues(List list1, List list2) {
        List list = new LinkedList();
        List maxList = new LinkedList();
        for (int i1 = 0; i1 < list1.size(); i1++)
            for (int i2 = 0; i2 < list2.size(); i2++)
                if (list1.get(i1) == list2.get(i2)) {
                    list = findIntersection(list1, list2, i1, i2);
                    maxList = findMaxList(list, maxList);
                }

        return maxList;
    }


    public List findIntersection(List list1, List list2, int i1, int i2) {
        int i = 0;
        List list = new LinkedList();
        list.clear();

        while (i1 < list1.size() && i2 < list2.size()) {
            if (list1.get(i1) == list2.get(i2)) {
                list.add(list1.get(i1));
            } else {
                return list;
            }
            i1++;
            i2++;
        }
        return list;
    }

    public List findMaxList(List list1, List list2) {
        List maxList = new LinkedList();
        if (list1.size() > list2.size()) {
            maxList = list1;
        } else {
            maxList = list2;
        }
        return maxList;
    }

}
