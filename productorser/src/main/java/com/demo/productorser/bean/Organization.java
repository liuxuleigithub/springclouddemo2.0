package com.demo.productorser.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "organizations")
public class Organization {
    @Id
    @Column(name = "organization_id", nullable = false)
    @NotNull(message="id不能为空")
    String id;

    @Column(name = "name", nullable = true)
    String name;

    @Column(name = "contact_name", nullable = true)
    String contactName;

    @Column(name = "contact_email", nullable = true)
    String contactEmail;

    @Column(name = "contact_phone", nullable = true)
    String contactPhone;


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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
