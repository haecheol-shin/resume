package project.resume.domain.member;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
public class Member {

    private Long id;
    @NotEmpty
    private String loginId; // 로그인 하는 ID
    @NotEmpty
    private String name; // 사용자 이름
    @NotEmpty
    private String password;
}
