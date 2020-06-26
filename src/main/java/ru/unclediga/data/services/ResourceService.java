package ru.unclediga.data.services;

import org.springframework.stereotype.Component;
import ru.unclediga.data.entities.Resource;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ResourceService {

    private List<Resource> resources = new LinkedList<Resource>();

    public ResourceService() {
        this.resources.add(new Resource(1L, "Coder", "Staff", new BigDecimal(
                "100.00"), "Hours"));
        this.resources.add(new Resource(2L, "Analyst", "Staff", new BigDecimal(
                "50.00"), "Hours"));
        this.resources.add(new Resource(3L, "Tester", "Staff", new BigDecimal(
                "70.00"), "Hours"));

    }

    public List<Resource> findAll() {
        return resources;
    }

    public Resource find(Long resourceId) {
        return resources.stream()
                .filter(it -> it.getResourceId().equals(resourceId))
                .collect(Collectors.toList())
                .get(0);
    }
}
