package ru.unclediga.data.services;

import ru.unclediga.data.entities.Project;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectService {
    private final List<Project> projects = new LinkedList<>();

    public ProjectService() {
        Project javaProject = this.createProject("Java Project", "This is a Java Project");
        Project javascriptProject = this.createProject("Javascript Project", "This is a Javascript Project");
        Project htmlProject = this.createProject("HTML Project", "This is an HTML project");
        this.projects.addAll(Arrays.asList(javaProject, javascriptProject, htmlProject));
    }

    public List<Project> findAll() {
        return this.projects;
    }

    public Project find(Long projectId) {
        final List<Project> list = projects.stream()
                .filter(it -> it.getProjectId().equals(projectId))
                .collect(Collectors.toList());
        return list.size() > 0 ? list.get(0) : null;
    }

    public void save(Project project) {
        Project project1 = find(project.getProjectId());
        if (project1 != null) {
            projects.remove(project1);
        }
        projects.add(project);
    }

    private Project createProject(String title, String description) {
        Project project = new Project();
        project.setName(title);
        project.setAuthorizedFunds(new BigDecimal("100000"));
        project.setAuthorizedHours(new BigDecimal("1000"));
        project.setProjectId(1L);
        project.setSpecial(false);
        project.setType("multi");
        project.setYear("2015");
        project.setDescription(description);
        return project;
    }
}


