package department;

public class SortedList implements SortedStrorage{
    private ElementOfSortedList firstElement;
    private ElementOfSortedList lastElement;
    private ElementOfSortedList pointer;

    public SortedList()
    {
        this.firstElement = null;
        this.lastElement = null;
        this.pointer = null;
    }


    public NodeOfTree add(String codeOfChild) {
        NodeOfTree temp;
        if (this.isEmpty())
        {
            temp = new NodeOfTree(codeOfChild, new SortedList());
            firstElement = new ElementOfSortedList(temp);
            lastElement = firstElement;
            pointer = firstElement;
        }
        else
        {
            ElementOfSortedList current = firstElement;
            while (current != null && codeOfChild.compareTo(current.getKey().getCode()) > 0)
            {
                current = current.getNextElement();
            }
            if (current != null && codeOfChild.equals(current.getKey().getCode()))
            {
                temp = current.getKey();
            }
            else
            {
                temp = new NodeOfTree(codeOfChild, new SortedList());
                ElementOfSortedList newElement = new ElementOfSortedList(temp);
                if (current == null)
                {
                lastElement.setNextElement(newElement);
                newElement.setPrevElement(lastElement);
                lastElement = newElement;
                }
                else if (current == firstElement)
                {
                    firstElement.setPrevElement(newElement);
                    newElement.setNextElement(firstElement);
                    firstElement = newElement;
                }
                else
                {
                    current.getPrevElement().setNextElement(newElement);
                    newElement.setPrevElement(current.getPrevElement());
                    current.setPrevElement(newElement);
                    newElement.setNextElement(current);
                }
            }
        }
        return temp;
    }

    public NodeOfTree setPointerIntoFirstElement() {
        if (this.firstElement == null)
        {
            throw new NullPointerException();
        }
        this.pointer = this.firstElement;
        return this.pointer.getKey();
    }

    public NodeOfTree setPointerIntoLastElement() {
        if (this.lastElement == null)
        {
            throw new NullPointerException();
        }
        this.pointer = this.lastElement;
        return this.pointer.getKey();
    }

    public NodeOfTree movePointerOnNext() {
        if (!this.hasNextElement())
        {
            throw new NullPointerException();
        }
        this.pointer = this.pointer.getNextElement();
        return this.pointer.getKey();
    }

    public NodeOfTree movePointerOnPrev() {
        if (!this.hasPrevElement())
        {
            throw new NullPointerException();
        }
        this.pointer = this.pointer.getPrevElement();
        return this.pointer.getKey();
    }

    public boolean hasPrevElement() {
        if (this.pointer == null)
        {
            throw new NullPointerException();
        }
        return this.pointer.getPrevElement() != null;
    }

    public boolean hasNextElement() {
        if (this.pointer == null)
        {
            throw new NullPointerException();
        }
        return this.pointer.getNextElement() != null;
    }

    public boolean isEmpty()
    {
        return this.firstElement == null;
    }

    public String getCodeOfPointer()
    {
        return pointer.getKey().getCode();
    }
}
