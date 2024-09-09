package auction.guad.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Mileage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mileageNum;
    private String memberEmail;
    private LocalDateTime chargedAt;
    private int chargedAmount;
    private String chargedMethod;
}
