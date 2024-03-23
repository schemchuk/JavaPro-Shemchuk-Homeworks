package de.telran.myNewsGroup.module2.homeWork3.office;

public  class Task {
    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

//    @Override
//    public String toString() {
//        return "Task{" +
//                "name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//
//    }
}
