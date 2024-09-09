package auction.guad.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class AuctionUp {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auctionUpNum;
    private int itemNum;
    private String memberEmail;
    private int auctionPrice;
    private LocalDateTime auctionTime;
}
