package com.BugFix.freeLancing.mentor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

    @Query(
            "SELECT m FROM Mentor m " +
                    "WHERE (:category IS NULL OR m.category = :category) " +
                    "AND ( " +
                    "   :skill IS NULL OR " +
                    "   LOWER(m.skill1) LIKE LOWER(CONCAT('%', :skill, '%')) OR " +
                    "   LOWER(m.skill2) LIKE LOWER(CONCAT('%', :skill, '%')) " +
                    ")"
    )
    List<Mentor> filterMentors(
            @Param("category") String category,
            @Param("skill") String skill
    );

}
