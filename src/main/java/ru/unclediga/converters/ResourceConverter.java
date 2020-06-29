package ru.unclediga.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import ru.unclediga.data.entities.Resource;
import ru.unclediga.data.services.ResourceService;

public class ResourceConverter implements Converter<String, Resource> {
    @Autowired
    private ResourceService service;

    @Override
    public Resource convert(String resourceId) {
        return service.find(Long.parseLong(resourceId));
    }
}
