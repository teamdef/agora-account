package def.agoraaccount.auth;

import def.agoraaccount.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorizationService {

    private final JwtUtil jwtUtil;

    public ResponseEntity<AuthResponse> login(Member member) {

        return ResponseEntity.ok(new AuthResponse(jwtUtil.generateToken(member)));
    }
}
