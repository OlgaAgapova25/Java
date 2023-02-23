package HW3.Task2;

import java.util.ArrayList;
import java.util.List;

/**Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 *
 */
public class Main {
    public static void main(String[] args) {
        HW3.Task2.Items item1 = new HW3.Task2.Items("orange", 2.0, "Marocco", 1.2, 1);
        HW3.Task2.Items item2 = new HW3.Task2.Items("bread", 2.0, "Russia", 0.5, 1);
        HW3.Task2.Items item3 = new HW3.Task2.Items("milk", 4.0, "Russia", 1.0, 2);
        HW3.Task2.Items item4 = new HW3.Task2.Items("cake", 3.0, "Russia", 1.0, 2);

        List<HW3.Task2.Items> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        System.out.println(itemsList);
        Integer searchSort = 2;
        double minPrice = 0;
        List resultList = new ArrayList<>();
        for (Items items : itemsList) {
                 if(items.getSort().equals(searchSort) && items.getPrice() > minPrice){
                     minPrice = items.getPrice();
                 }
             }
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getSort().equals(searchSort)) {
                if (itemsList.get(i).getPrice() < minPrice) {
                    minPrice = itemsList.get(i).getPrice();
                    resultList.clear();
                    resultList.add(itemsList.get(i).getName());
                } else if (itemsList.get(i).getPrice() == minPrice) {
                    resultList.add(itemsList.get(i).getName());
                }
            }
        }
        System.out.println("Наименования товаров " +  searchSort + " сорта с наименьшей ценой: " +
                resultList + " ,цена = " + minPrice);
    }
}
