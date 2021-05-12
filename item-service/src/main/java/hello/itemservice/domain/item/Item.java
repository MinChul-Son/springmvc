package hello.itemservice.domain.item;


import lombok.Data;

@Data // @Data는 주의해서 사용해야함. @Getter, @Setter만 사용하고, DTO의 경우에만 @Data 사용하기(이건 간단한 예제니까 그냥 @Data 사용했음)
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
