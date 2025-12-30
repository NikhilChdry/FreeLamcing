package com.BugFix.freeLancing.project;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "projects")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;

        @Column(length = 2000)
        private String description;

        private Double budget;

        private String status;     // OPEN, IN_PROGRESS, CLOSED

        private String createdBy;  // temporary (no auth yet)
}
