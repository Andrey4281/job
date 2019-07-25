package department;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {

    @Test
    public void add() {
        String [] in = {"K1\\SK1","K1\\SK2","K1\\SK9", "K1\\SK5",
                "K1\\SK4","K2"};

        SortedStrorage sortedStrorage = new SortedList();
        for (String str:
             in) {
            sortedStrorage.add(str);
        }

        String [] expected = {"K1\\SK1","K1\\SK2","K1\\SK4",
                "K1\\SK5","K1\\SK9","K2"};

        boolean acctualFlag = true;
        int index = 0;

        NodeOfTree current = sortedStrorage.setPointerIntoFirstElement();
        while (true)
        {
            if (!(expected[index].equals(current.getCode())))
            {
                acctualFlag = false;
                break;
            }
            else if (sortedStrorage.hasNextElement()) {
                current = sortedStrorage.movePointerOnNext();
                index++;
            }
            else break;
        }
        Assert.assertTrue(acctualFlag);
    }
}