package project.resume.web.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.resume.domain.member.MemberService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String loginForm() {
        return "member/login";
    }

    @PostMapping("/login")
    public String loginCheck() {
        return "redirect:/";
    }

    @GetMapping("/signup")
    public String signupForm() {
        return "member/signup";
    }

    @PostMapping("/signup")
    public String signupCheck() {
        return "redirect:/";
    }
}
