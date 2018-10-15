package com.demo.productorser.jpademo.repository;

import com.demo.productorser.bean.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationCrudRepository extends CrudRepository<Organization,String> {
    public Organization findById(Organization organizationId);
}
