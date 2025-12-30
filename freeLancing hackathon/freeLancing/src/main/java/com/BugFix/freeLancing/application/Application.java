package com.BugFix.freeLancing.application;

import com.BugFix.freeLancing.project.Project;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "applications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // many applications can belong to one project
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    private String applicantName;   // temporary (no auth yet)

    private String status;           // PENDING, ACCEPTED, REJECTED
}
