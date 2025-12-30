package com.BugFix.freeLancing.application;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/applications")
@CrossOrigin
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    // apply to a project
    @PostMapping("/apply")
    public Application applyToProject(@RequestParam Long projectId,
                                      @RequestParam String applicantName) {
        return applicationService.applyToProject(projectId, applicantName);
    }

    // get all applications for a project
    @GetMapping("/project/{projectId}")
    public List<Application> getApplicationsForProject(@PathVariable Long projectId) {
        return applicationService.getApplicationsForProject(projectId);
    }
}
