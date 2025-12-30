package com.BugFix.freeLancing.mentor;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mentors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Card header
    private String projectTitle;        // E-commerce Redesign
    private String mentorName;          // Sarah Jenkins
    private String mentorRole;          // UX Lead
    private String mentorImageUrl;      // profile image

    // Card body
    @Column(length = 1000)
    private String description;

    private String category;
    // Tags
    private String skill1;              // Figma
    private String skill2;              // UX Research

    // Meta
    private String hoursPerWeek;        // 5–10 hrs/week
    private String level;               // Intermediate

    // Learning benefit
    @Column(length = 500)
    private String learningBenefit;

    // getters & setters
}
