package department;

public class NodeOfTree {
    private final String code;
    private final SortedStrorage childs;

    public NodeOfTree(String code,SortedList childs)
    {
        this.code = code;
        this.childs = childs;

    }

    public NodeOfTree addChild(String codeOfChild)
    {
        return this.childs.add(codeOfChild);
    }

    public String getCode()
    {
        return this.code;
    }

    public NodeOfTree setPointerIntoFirstChild()
    {
        return this.childs.setPointerIntoFirstElement();
    }

    public NodeOfTree setPointerIntoLastChild()
    {
        return this.childs.setPointerIntoLastElement();
    }

    public NodeOfTree movePointerOnNextChild()
    {
        return this.childs.movePointerOnNext();
    }
    public NodeOfTree movePointerOnPrevChild()
    {
        return this.childs.movePointerOnPrev();
    }
    public boolean hasPrevChild()
    {
        return this.childs.hasPrevElement();
    }
    public boolean hasNextChild()
    {
        return this.childs.hasNextElement();
    }
    public boolean isLeaf() {return childs.isEmpty();}
}
