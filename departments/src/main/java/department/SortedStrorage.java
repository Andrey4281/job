package department;

/**This is main interface for sorted strorage
 * SortedStrorage may be implemented on base sorted list, sorted array,
 * binary tree, ect.
 * @author andreysemenov
 * @since 25.07.2019
 */
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