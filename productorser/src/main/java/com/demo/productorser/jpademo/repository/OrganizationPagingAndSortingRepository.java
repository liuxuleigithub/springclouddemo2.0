package com.demo.productorser.jpademo.repository;

import com.demo.productorser.bean.Organization;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationPagingAndSortingRepository extends PagingAndSortingRepository<Organization,String> {
//    public Organization findById(String organizationId);
}
