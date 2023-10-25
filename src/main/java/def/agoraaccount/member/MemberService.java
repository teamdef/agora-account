package def.agoraaccount.member;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepo memberRepo;
    public ResponseEntity<List<MemberDto>> findFilteredMembers(List<String> filterNames) {

        List<MemberDto> members = memberRepo.findAll().stream()
                .filter(member -> !filterNames.contains(member.getNickName()))
                .map(MemberDto::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(members);
    }
}
