package com.demo.consumerser.api;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productorser")//使用feign调用微服务接口  productorser:被服务id
public interface OrganizationApi {

    @GetMapping(value = "organization/{id}")
    String getOrganization(@PathVariable("id") String id);

    @GetMapping(value = "organization/listPageByPagehelper")
    String listPageByPagehelper();

    @GetMapping(value = "organization/findListByPagingAndSorting")
    String findListByPagingAndSorting();

}
