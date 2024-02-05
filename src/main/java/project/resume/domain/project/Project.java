package project.resume.domain.project;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Project {
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
