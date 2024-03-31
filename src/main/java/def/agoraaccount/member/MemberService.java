package def.agoraaccount.member;

import def.agoraaccount.auth.AuthenticationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepo memberRepo;
    public ResponseEntity<List<MemberDto>> findFilteredMembers(List<String> filterNames) {

        List<MemberDto> members = memberRepo.findAll().stream()
                .filter(member -> !filterNames.contains(member.getNickname()))
                .map(MemberDto::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(members);
    }

    public MemberDto findMember(Long memberId) throws Exception{

        Member member = memberRepo.findById(memberId).orElseThrow(ClassNotFoundException::new);

        return new MemberDto(member);
    }

    public Member findEnrollmember(AuthenticationRequest authenticationRequest) {

        Optional<Member> member = memberRepo
                .findMemberByNicknameAndPassword(authenticationRequest.getNickName(), authenticationRequest.getPassword());

        return member.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND, "회원이 존재하지 않습니다."));
    }
}
