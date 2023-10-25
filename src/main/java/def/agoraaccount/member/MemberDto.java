package def.agoraaccount.member;

import lombok.Getter;

@Getter
public class MemberDto {

    private String nickName;
    private String img;

    public MemberDto(Member member) {
        this.nickName = member.getNickName();
        this.img = member.getImg();
    }
}
