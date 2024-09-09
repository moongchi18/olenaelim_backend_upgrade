package auction.guad.entity;

import auction.guad.constant.DeliveryState;
import auction.guad.constant.SellState;
import auction.guad.constant.SellType;
import auction.guad.constant.YesNo;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class SellItems {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemNum;

    @Enumerated(EnumType.STRING)
    private SellType sellType;
    @Enumerated(EnumType.STRING)
    private SellState sellState;
    @Enumerated(EnumType.STRING)
    private DeliveryState deliveryState;

    private String sellerEmail;
    private String title;
    private String content;
    private int price;
    private String itemType;
    private String itemDetailType;
    private LocalDateTime writtenAt;
    private int hitCount;
    private int auctionStartPrice;
    private int auctionMaxPrice;
    private int auctionMinPrice;
    private int auctionPeriodTime;
    private int auctionPeriodDay;
    private LocalDateTime auctionFinishedAt;
    private int auctionRandomMethod;
    private int auctionDiscountPerHour;

    @Enumerated(EnumType.STRING)
    private YesNo soldYn;
    private LocalDateTime soldAt;
    @Enumerated(EnumType.STRING)
    private YesNo deletedYn;
    private LocalDateTime deletedAt;
}
