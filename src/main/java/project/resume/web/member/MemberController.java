package project.resume.web.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import project.resume.domain.member.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
}
