package def.agoraaccount.member;

import lombok.Getter;

@Getter
public class MemberDto {

    private Long id;
    private String nickName;
    private String img;

    public MemberDto(Member member) {
        this.id = member.getId();
        this.nickName = member.getNickName();
        this.img = member.getImg();
    }
}
