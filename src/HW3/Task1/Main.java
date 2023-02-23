package HW3.Task1;

import java.util.ArrayList;
import java.util.List;

/** Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        Items items = new Items("мука высший сорт", 10.0, 1);
        Items items2 = new Items("виноград высший", 12.3, 2);
        Items items3 = new Items("молоко", 7.7, 3);
        Items items4 = new Items("яйца высший", 15.0, 3);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        System.out.println(itemsList);
        String searchName = "высший";
        double maxPrice = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().contains(searchName) &&
                    (itemsList.get(i).getSort().equals(1) || itemsList.get(i).getSort().equals(2))) {
                if (itemsList.get(i).getPrice() > maxPrice) maxPrice = itemsList.get(i).getPrice();
            }
        }
        System.out.println("Наибольшая цена товаров 1го или 2го сорта среди товаров, " +
                "название которых содержит «высший» = " + maxPrice);
    }
}