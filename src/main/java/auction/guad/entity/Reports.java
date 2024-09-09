package auction.guad.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Reports {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reportNum;
    private int itemNum;
    private String memberEmail;
    private String title;
    private String content;
    private LocalDateTime reportedAt;
}
