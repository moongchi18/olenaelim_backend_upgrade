package auction.guad.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class AuctionDown {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auctionDownNum;
    private int itemNum;
    private int auctionPer;
    private LocalDateTime auctionTime;
}
