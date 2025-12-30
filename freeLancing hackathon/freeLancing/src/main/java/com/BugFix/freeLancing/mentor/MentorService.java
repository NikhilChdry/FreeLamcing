package com.BugFix.freeLancing.mentor;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MentorService {

    private final MentorRepository repository;

    public MentorService(MentorRepository repository) {
        this.repository = repository;
    }

    public List<Mentor> getAllMentors() {
        return repository.findAll();
    }

    public List<Mentor> filterMentors(String category, String skill) {
        if ((category == null || category.isEmpty()) &&
                (skill == null || skill.isEmpty())) {
            return repository.findAll();
        }

        return repository.filterMentors(category, skill);
    }
}

