package def.agoraaccount.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AuthenticationRequest {

    private String nickName;
    private String password;
}
