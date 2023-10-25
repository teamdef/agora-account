package def.agoraaccount.member;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    @GetMapping("/members")
    public ResponseEntity<List<MemberDto>> getMember(
            @RequestParam("filterNames") List<String> filterNames
    ) {
        return memberService.findFilteredMembers(filterNames);
    }
}
