package com.demo.productorser.jpademo.repository;

import com.demo.productorser.bean.Organization;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationMybatis{
    List<Organization> findList();
}
