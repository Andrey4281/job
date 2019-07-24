package department;

public class ElementOfSortedList {
    private NodeOfTree key;
    private ElementOfSortedList prevElement;
    private ElementOfSortedList nextElement;

    public ElementOfSortedList(NodeOfTree key)
    {
        this.key = key;
        this.prevElement = null;
        this.nextElement = null;
    }

    public void setPrevElement(ElementOfSortedList prevElement)
    {
        this.prevElement = prevElement;
    }

    public void setNextElement(ElementOfSortedList nextElement)
    {
        this.nextElement = nextElement;
    }

    public ElementOfSortedList getPrevElement()
    {
        return this.prevElement;
    }

    public ElementOfSortedList getNextElement()
    {
        return this.nextElement;
    }

    public NodeOfTree getKey()
    {
        return this.key;
    }
}
