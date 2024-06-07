package com.school.exam2.service;


import com.school.exam2.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public java.util.List<T> findAll() {
        return projectRepository.findAll();
    }

    // Other business logic
}
