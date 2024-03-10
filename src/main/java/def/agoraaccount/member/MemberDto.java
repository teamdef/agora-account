package def.agoraaccount.member;

import lombok.Getter;

@Getter
public class MemberDto {

    private Long id;
    private String nickname;
    private String img;

    public MemberDto(Member member) {
        this.id = member.getId();
        this.nickname = member.getNickname();
        this.img = member.getImg();
    }
}
