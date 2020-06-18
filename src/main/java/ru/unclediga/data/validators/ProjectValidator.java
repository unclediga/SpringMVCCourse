package ru.unclediga.data.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.unclediga.data.entities.Project;

public class ProjectValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Project.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        final Project project = (Project) target;
        if(project.getName().length() < 5){
            errors.rejectValue("name","project.name","This name too short");
        }
    }
}
