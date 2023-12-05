package def.agoraaccount.member;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public ResponseEntity<List<MemberDto>> getMember(
            @RequestParam("filterNames") List<String> filterNames
    ) {
        return memberService.findFilteredMembers(filterNames);
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<MemberDto> getMemberDetail(
            @PathVariable Long memberId) throws Exception {

        return ResponseEntity.ok(memberService.findMember(memberId));
    }
}
