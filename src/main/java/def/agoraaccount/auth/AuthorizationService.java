package def.agoraaccount.auth;

import def.agoraaccount.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorizationService {

    private final JwtUtil jwtUtil;

    public ResponseEntity<String> login(Member member) {

        return ResponseEntity.ok(jwtUtil.generateToken(member));
    }
}
