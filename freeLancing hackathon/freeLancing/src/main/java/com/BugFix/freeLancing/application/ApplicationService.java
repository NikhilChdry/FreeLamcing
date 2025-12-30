package com.BugFix.freeLancing.application;

import com.BugFix.freeLancing.project.Project;
import com.BugFix.freeLancing.project.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final ProjectRepository projectRepository;

    public ApplicationService(ApplicationRepository applicationRepository,
                              ProjectRepository projectRepository) {
        this.applicationRepository = applicationRepository;
        this.projectRepository = projectRepository;
    }

    // apply to a project
    public Application applyToProject(Long projectId, String applicantName) {
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        Application application = Application.builder()
                .project(project)
                .applicantName(applicantName)
                .status("PENDING")
                .build();

        return applicationRepository.save(application);
    }

    // view all applications for a project
    public List<Application> getApplicationsForProject(Long projectId) {
        return applicationRepository.findByProjectId(projectId);
    }
}
