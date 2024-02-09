package project.resume.domain.project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String projectName;
    @NotEmpty
    private String duration;
    @NotEmpty
    private String worker;
    @NotEmpty
    private String projectPurpose;
    @NotEmpty
    private String description;
    @NotEmpty
    private String languageAndEnvironment;
}
