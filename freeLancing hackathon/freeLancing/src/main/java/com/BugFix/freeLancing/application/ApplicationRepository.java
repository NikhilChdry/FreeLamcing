package com.BugFix.freeLancing.application;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    // get all applications for a project
    List<Application> findByProjectId(Long projectId);
}
