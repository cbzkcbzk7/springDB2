package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
// JPA가 사용하는 객체라는 뜻
@Entity
//@Table(name = "item") : 클래스명이랑 같을 경우 생략 가능
public class Item {

    // @Id : PK와 매핑
//  GenerationType.IDENTITY : DB에서 값을 넣어주는 전략
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // name : db 컬럼명(변수명과 같을 경우 생략 가능)
    // @Column : 스프링부트의 경우 자동 맵핑해주므로 생략 가능
    @Column(name = "item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;

    // JPA는 'public' 또는 'protected'의 기본 생성자가 필수이므로 꼭 생성.
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
