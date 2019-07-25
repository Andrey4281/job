package department;

import java.util.LinkedList;

/**This is implementation of SortDepartment on base Trees
 * @author andreysemenov
 * @since 24.07.2019
 */
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

    public LinkedList <String> sortUp() {
        LinkedList <String> list = new LinkedList<>();
        sortUpRec(list,root);
        list.removeFirst();
        return list;
    }

    public LinkedList <String> sortDown() {
        LinkedList <String> list = new LinkedList<>();
        sortDownRec(list,root);
        list.removeFirst();
        return list;
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

    private void sortUpRec(LinkedList <String> sortCodes, NodeOfTree topOfTree)
    {
        sortCodes.add(topOfTree.getCode());
        if (topOfTree.isLeaf()) return;
        else {
            NodeOfTree current = topOfTree.setPointerIntoFirstChild();
            while (true)
            {
                sortUpRec(sortCodes,current);
                if (topOfTree.hasNextChild())
                    current = topOfTree.movePointerOnNextChild();
                else break;
            }
        }
    }

    private void sortDownRec(LinkedList <String> sortCodes, NodeOfTree topOfTree)
    {
        sortCodes.add(topOfTree.getCode());
        if (topOfTree.isLeaf()) return;
        else {
            NodeOfTree current = topOfTree.setPointerIntoLastChild();
            while (true)
            {
                sortDownRec(sortCodes,current);
                if (topOfTree.hasPrevChild())
                    current = topOfTree.movePointerOnPrevChild();
                else break;
            }
        }
    }
}
