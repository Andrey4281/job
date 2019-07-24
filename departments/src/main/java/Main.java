import department.SortDepartment;
import department.SortDepartmentTree;
import department.SortedList;
import department.SortedStrorage;

import java.util.LinkedList;

public class Main {
    public static void main(String [] args)
    {
        SortDepartment sortDepartment = new SortDepartmentTree();
        String [] codes = {"K1\\SK1","K1\\SK2","K1\\SK1\\SSK1",
        "K1\\SK1\\SSK2","K2","K2\\SK1\\SSK1","K2\\SK1\\SSK2"};

        sortDepartment.buildDataStructureForSort(codes);
        String [] result = sortDepartment.sortUp();

    }

}
