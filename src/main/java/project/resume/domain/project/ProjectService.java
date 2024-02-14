package project.resume.domain.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Project findProject(Long id) {
        return projectRepository.findById(id);
    }

    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    public void createProject(Project project) {
        projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    // 수정 만들어야 함.



}
