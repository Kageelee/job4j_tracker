package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private String group;
    private LocalDate created;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(int year, int month, int dayOfMonth) {
        this.created = LocalDate.of(year, month, dayOfMonth);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Koksharov Kirill Sergeevich");
        student.setGroup("ATP-463B");
        student.setCreated(2022, 9, 4);
        System.out.println(student.getFullName() + " from the group " + student.getGroup()
                + " entered the university in " + student.getCreated());
    }
}
