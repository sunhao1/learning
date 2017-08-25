package Day20;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo {
    public static void main(String[] args) {
        method_get();

    }

    public static void method_get() {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");
        sop("size:" + al.size());
        sop(al);
        ListIterator LI = al.listIterator();
        sop(LI);
        while(LI.hasNext()) {
            Object obj = LI.next();
            if (obj.equals("java02"))
                LI.add("JAVA09");
        }
        sop(LI);
        al.remove(1);
        sop(al.get(1));
        sop(al.set(2, "java07"));
        sop(al);

        for (Iterator it = al.iterator(); it.hasNext(); ) {
            sop(it.next());
        }
        sop("cleall:" + al.remove("java01"));
        sop(al);

    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}


