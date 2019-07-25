package department;

import java.util.LinkedList;

/**Main interface for solve task about sorting of department
 * @author andreysemenov
 * @since 24.07.19
 */
public interface SortDepartment {
    public void buildDataStructureForSort(String [] codes);
    public LinkedList <String> sortUp();
    public LinkedList <String> sortDown();

}
