package department;

import java.util.LinkedList;

public class SortDepartmentTree implements SortDepartment {
    private final NodeOfTree root;

    public SortDepartmentTree()
    {
        root = new NodeOfTree("\\",new SortedList());
    }

    public void buildDataStructureForSort(String[] codes) {
        for (String code:
             codes) {
            LinkedList <String> nodes = getNodesFromCode(code);
            NodeOfTree current = root;
            for (String node:
                 nodes) {
                current = current.addChild(node);
            }
        }
    }

    public String[] sortUp() {
        LinkedList <String> list = new LinkedList<>();
        sortUpRec(list,root);

        double a = 5;
        return (String[]) list.toArray();
    }

    public String[] sortDown() {
        return new String[0];
    }

    private LinkedList <String> getNodesFromCode(String code)
    {
        LinkedList <String> nodes = new LinkedList<>();
        for (int i = 0; i < code.length(); i++)
        {
            if (code.charAt(i) == '\\')
                nodes.add(code.substring(0,i));
        }
        nodes.add(code);
        return nodes;
    }

    private void sortUpRec(LinkedList <String> sortCodes, NodeOfTree ro)
    {
        sortCodes.add(ro.getCode());
        if (ro.isLeaf()) return;
        else {
            NodeOfTree current = ro.setPointerIntoFirstChild();
            while (true)
            {
                sortUpRec(sortCodes,current);
                if (!ro.isLeaf() && ro.hasNextChild()) current = ro.movePointerOnNextChild();
                else break;
            }
        }
    }
}
