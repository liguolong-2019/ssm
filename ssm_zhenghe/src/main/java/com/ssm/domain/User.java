package com.ssm.domain;

public class User {
    private Integer id;
    private String name;
    private String nation;
    private String phone;

    @Override
    public String toString() {
        return "用户"+this.id+":"+this.name;
    }

    private String mail;
    private String address;
    private String birthday;
    private String height;
    private String school;
    private String degree;
    private String education;
    private String schoolthing;
    private String workthing;
    private String skill;
    private String self;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchoolthing() {
        return schoolthing;
    }

    public void setSchoolthing(String schoolthing) {
        this.schoolthing = schoolthing;
    }

    public String getWorkthing() {
        return workthing;
    }

    public void setWorkthing(String workthing) {
        this.workthing = workthing;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
