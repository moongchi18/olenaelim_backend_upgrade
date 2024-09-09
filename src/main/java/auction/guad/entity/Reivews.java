package auction.guad.entity;

import auction.guad.constant.YesNo;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Reivews {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewNum;
    private int itemNum;
    private String sellerEmail;
    private String writerEmail;
    private String writerNickname;
    private String contents;
    private int starPoint;
    private LocalDateTime writtenAt;
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private YesNo deleteYn;

    private LocalDateTime deletedAt;
}
