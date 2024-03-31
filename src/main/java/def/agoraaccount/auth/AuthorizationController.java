package def.agoraaccount.auth;

import def.agoraaccount.member.Member;
import def.agoraaccount.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthorizationController {

    private final AuthorizationService authorizationService;
    private final MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthenticationRequest authenticationRequest) {

        Member member = memberService.findEnrollmember(authenticationRequest);

        return authorizationService.login(member);
    }
}
