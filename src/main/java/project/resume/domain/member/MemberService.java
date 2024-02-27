package project.resume.domain.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void createMember(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long id) {
        return memberRepository.findById(id);
    }

    public void deleteMember(Member member) {
        memberRepository.delete(member);
    }
}
