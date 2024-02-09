package project.resume.domain.project;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProjectRepository {

    private final EntityManager em;

    // Read one
    public Project findById(Long id) {
        return em.find(Project.class, id);
    }

    // Read All

    public List<Project> findAll() {
        return em.createQuery("select p from Project p", Project.class)
                .getResultList();
    }

    // Create

    // Update

    // Delete
}
