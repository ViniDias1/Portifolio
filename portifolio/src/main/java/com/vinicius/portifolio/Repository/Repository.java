package com.vinicius.portifolio.service;

import com.vinicius.portifolio.dto.ProjectDTO;
import com.vinicius.portifolio.repository.ProjectsRepository;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectsRepository banco = new ProjectsRepository();



    public ProjectsRepository getAllProjects() {
        return banco;
    }

    public ProjectDTO addProject(ProjectDTO project) {
        banco.addBanco(project);
        return project;
    }
}

