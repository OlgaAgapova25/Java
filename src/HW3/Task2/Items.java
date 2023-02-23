package HW3.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private Double price;
    private String country;
    private Double weigh;
    private Integer sort;

}
