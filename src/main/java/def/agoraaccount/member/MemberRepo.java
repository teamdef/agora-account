package def.agoraaccount.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepo extends JpaRepository<Member, Long> {
    Optional<Member> findMemberByNicknameAndPassword(String nickname, String password);
}
