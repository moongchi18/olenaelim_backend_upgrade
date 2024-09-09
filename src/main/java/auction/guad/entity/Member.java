package auction.guad.entity;

import auction.guad.constant.Gender;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberNum;
    private String nickname;
    private String pass;
    private String email;
    private String phone;
    private String address;
    private String addressDetail;
    private LocalDateTime joinDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int mileage;
    private int usedMileage;
    private String loginImgName;
    private String managerYn;
    private String deleteYn;
    private LocalDateTime updateDateTime;
}
