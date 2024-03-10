package def.agoraaccount.member;

import lombok.Getter;

@Getter
public class MemberDto {

    private Long id;
    private String nickname;
    private String name;
    private String profileImg;

    public MemberDto(Member member) {
        this.id = member.getId();
        this.nickname = member.getNickname();
        this.profileImg = member.getProfileImg();
        this.name = member.getName();
    }
}
