package project.resume.web.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import project.resume.domain.project.ProjectService;

@Controller
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;
}
