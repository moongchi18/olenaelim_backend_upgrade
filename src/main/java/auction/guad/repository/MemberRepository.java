package auction.guad.repository;

import auction.guad.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    public Member findByEmail(String email);
    public int countMembersByEmail(String email);
}
