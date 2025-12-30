package com.BugFix.freeLancing.mentor;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mentors")
@CrossOrigin
public class MentorController {

    private final MentorService mentorService;

    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping
    public List<Mentor> getAllMentors() {
        return mentorService.getAllMentors();
    }

    @GetMapping("/filter")
    public List<Mentor> filterMentors(
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String skill) {

        if (category != null && category.isBlank()) category = null;
        if (skill != null && skill.isBlank()) skill = null;

        return mentorService.filterMentors(category, skill);
    }
}

