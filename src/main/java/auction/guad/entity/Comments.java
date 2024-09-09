package auction.guad.entity;

import auction.guad.constant.YesNo;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Comments {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentNum;
    private int itemNum;
    private String memberEmail;
    private String writerNickname;
    private String comments;

    @Enumerated(EnumType.STRING)
    private YesNo deleteYn;

    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
}
