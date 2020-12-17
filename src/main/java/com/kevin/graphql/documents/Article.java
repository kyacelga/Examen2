package com.kevin.graphql.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Article {
    @Id
    private String id;
    private String name;
    private String email,
    private String age,
    private String address,
    private String phone,
   

    public Article() {
    }

    public Article(String id, String name, String email,String age,String address,String phone) {
        this.id = id;
        this.name = name;
        this.email= email;
        this.age= age;
        this.address= address;
        this.phone=phone;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }
    public String getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
