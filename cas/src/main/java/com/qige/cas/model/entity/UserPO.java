package com.qige.cas.model.entity;


import javax.persistence.*;

/**
 * @author 王亚东
 * @date 2020/3/25 23:11
 */
@Entity
@Table(name= "t_user")
public class UserPO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Users{");
        sb.append("id = ").append(id);
        sb.append(", name =' ").append(name).append("\' ");
        sb.append(", password =' ").append(name).append("\' ");
        sb.append("}");
        return sb.toString();
    }
}
