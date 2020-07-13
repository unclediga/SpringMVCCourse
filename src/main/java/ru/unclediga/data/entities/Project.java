package ru.unclediga.data.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Project {
    private Long projectId;
    @Size(min = 2,max = 10)
    private String name;
    @NotBlank
    @Size(min = 1)
    private String description;
    private Sponsor sponsor;
    @Min(10)
    private BigDecimal authorizedHours;
    @Min(20)
    private BigDecimal authorizedFunds;
    private String year;
    private boolean special;
    @NotNull
    private String type;
    private List<String> pointOfContact;

    private Date startDate;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public BigDecimal getAuthorizedHours() {
        return authorizedHours;
    }

    public void setAuthorizedHours(BigDecimal authorizedHours) {
        this.authorizedHours = authorizedHours;
    }

    public BigDecimal getAuthorizedFunds() {
        return authorizedFunds;
    }

    public void setAuthorizedFunds(BigDecimal authorizedFunds) {
        this.authorizedFunds = authorizedFunds;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getPointOfContact() {
        return pointOfContact;
    }

    public void setPointOfContact(List<String> pointOfContact) {
        this.pointOfContact = pointOfContact;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sponsor=" + sponsor +
                ", authorizedHours=" + authorizedHours +
                ", authorizedFunds=" + authorizedFunds +
                ", year='" + year + '\'' +
                ", special=" + special +
                ", type='" + type + '\'' +
                ", pointOfContact=" + pointOfContact +
                ", startDate=" + startDate +
                '}';
    }
}
