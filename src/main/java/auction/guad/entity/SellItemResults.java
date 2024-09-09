package auction.guad.entity;

import auction.guad.constant.SellState;
import auction.guad.constant.SellType;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class SellItemResults {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemResultNum;

    private int itemNum;

    @Enumerated(EnumType.STRING)
    private SellState sellState;

    @Enumerated(EnumType.STRING)
    private SellType sellType;

    private String sellerEmail;
    private String sellerPhone;
    private String buyerEmail;
    private String buyerPhone;
    private String deliveryAddress;
    private String itemTitle;
    private String itemPrice;
    private LocalDateTime soldAt;
}
