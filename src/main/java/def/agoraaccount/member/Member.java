package def.agoraaccount.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long id;
    @NotNull
    private String nickname;
    @NotNull
    private String img;
}
