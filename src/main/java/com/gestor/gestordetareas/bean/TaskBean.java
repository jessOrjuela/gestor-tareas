package com.gestor.gestordetareas.bean;

public class TaskBean {
    private String description;

    public TaskBean() {
    }

    public TaskBean(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TaskBean{" +
                "description='" + description + '\'' +
                '}';
    }
}
