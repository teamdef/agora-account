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
    private long id;
    @NotNull
    private String nickName;
    @NotNull
    private String img;
}
