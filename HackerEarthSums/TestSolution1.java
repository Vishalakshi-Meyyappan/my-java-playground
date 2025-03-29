package HackerEarthSums;

import java.util.ArrayList;
import java.util.Iterator;

public class TestSolution1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Kate");
        al.add("Leo");
        al.add("Rose");
        al.add("Jack");
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next() + "1");
            itr.next();
        }

    }
}