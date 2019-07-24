package department;

public interface SortedStrorage {
    public NodeOfTree add(String codeOfChild);
    public NodeOfTree setPointerIntoFirstElement();
    public NodeOfTree setPointerIntoLastElement();
    public NodeOfTree movePointerOnNext();
    public NodeOfTree movePointerOnPrev();
    public boolean hasPrevElement();
    public boolean hasNextElement();
    public boolean isEmpty();
}