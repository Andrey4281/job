package department;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class SortDepartmentTreeTest {

    @Test
    public void sortUp() {
        String [] in = {"K1\\SK1","K1\\SK2","K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2","K2","K2\\SK1\\SSK1","K2\\SK1\\SSK2"};
        SortDepartment sortDepartment = new SortDepartmentTree();
        sortDepartment.buildDataStructureForSort(in);

        LinkedList <String> expected = new LinkedList<>();
        expected.add("K1");
        expected.add("K1\\SK1");
        expected.add("K1\\SK1\\SSK1");
        expected.add("K1\\SK1\\SSK2");
        expected.add("K1\\SK2");
        expected.add("K2");
        expected.add("K2\\SK1");
        expected.add("K2\\SK1\\SSK1");
        expected.add("K2\\SK1\\SSK2");

        LinkedList <String> out = sortDepartment.sortUp();

        Assert.assertEquals(expected,out);
    }

    @Test
    public void sortDown() {
        String [] in = {"K1\\SK1","K1\\SK2","K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2","K2","K2\\SK1\\SSK1","K2\\SK1\\SSK2"};
        SortDepartment sortDepartment = new SortDepartmentTree();
        sortDepartment.buildDataStructureForSort(in);

        LinkedList <String> expected = new LinkedList<>();
        expected.add("K2");
        expected.add("K2\\SK1");
        expected.add("K2\\SK1\\SSK2");
        expected.add("K2\\SK1\\SSK1");
        expected.add("K1");
        expected.add("K1\\SK2");
        expected.add("K1\\SK1");
        expected.add("K1\\SK1\\SSK2");
        expected.add("K1\\SK1\\SSK1");

        LinkedList <String> out = sortDepartment.sortDown();


        Assert.assertEquals(expected,out);
    }
}