package collections.interfaces;

import collections.model.ArrayListModel;

public interface IArrayListTest {

    public void addItemToList(ArrayListModel model);

    public void ShowListItems(int position);
    public void deleteItemFromList(int position);

    public void deleteAllItemsFromList(ArrayListModel model);

}
