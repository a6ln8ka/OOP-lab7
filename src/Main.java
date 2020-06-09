import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(new Candies(0, 0, 3, true));
        myList.add(new Candies(1,1, 60, false));
        myList.add(new Candies(2,2, 40, true));

        MyList emptyList = new MyList();
        emptyList.add(new Candies(3,3, 30, false));

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Candies(4,4, 40, true));
        arrayList.add(new Candies(5,5, 50, false));
        arrayList.add(new Candies(6,6, 60, false));
        arrayList.add(new Candies(2, 2, 20, false));
        MyList list2 = new MyList(arrayList);

        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(iterator.next());

        System.out.println("++++++++++++");

        ListIterator listIterator = list2.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

        System.out.println(list2.contains(new Candies(6,6, 60, false)));
    }
}
