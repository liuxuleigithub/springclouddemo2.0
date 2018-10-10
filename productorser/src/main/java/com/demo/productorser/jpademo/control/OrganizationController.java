package com.demo.productorser.jpademo.control;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.productorser.jpademo.services.OrganizationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.demo.productorser.bean.Organization;
import com.demo.productorser.utils.ResponseObject;
import com.demo.productorser.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/*
*
*
* 使用Spring Data JPA CrudRepository 和JpaRepository 的好处：

继承这些接口，可以使Spring找到自定义的数据库操作接口，并生成代理类，后续可以注入到Spring容器中；
可以不写相关的sql操作，由代理类生成
他们存在继承关系：

　　PagingAndSortingRepository 继承 CrudRepository
　　JpaRepository 继承 PagingAndSortingRepository

也就是说， CrudRepository 提供基本的增删改查；PagingAndSortingRepository 提供分页和排序方法；JpaRepository 提供JPA需要的方法。
*
*
* */

@RestController
@RequestMapping(value="organization")
public class OrganizationController {

    @Autowired
    private OrganizationService orgService;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)   //jpa通过方法名自动完成sql
    public String getOrganization(@PathVariable("id") String id) {
        ResponseObject responseObject =  new ResponseObject(ResponseStatus.Success, orgService.getOrg(id),"success");
        JSONObject responsejson = (JSONObject) JSON.toJSON(responseObject);
        return responsejson.toString();
    }

    @RequestMapping(value="/listPageByPagehelper",method = RequestMethod.GET)//pagehelper分页
    public String listPageByPagehelper(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "1") Integer size) {
        PageHelper.startPage(page, size);
        ResponseObject responseObject =  new ResponseObject(ResponseStatus.Success, new PageInfo(orgService.findAllByJpa()),"success");
        JSONObject responsejson = (JSONObject) JSON.toJSON(responseObject);
        return responsejson.toString();
    }

    @RequestMapping(value="/findListByPagingAndSorting",method = RequestMethod.GET)//PagingAndSortingRepository分页
    public String findListByPagingAndSorting(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "1") Integer size) {
        Pageable pageable = new PageRequest(page,size);
        ResponseObject responseObject =  new ResponseObject(ResponseStatus.Success, orgService.findAllByPagingAndSorting(pageable),"success");
        JSONObject responsejson = (JSONObject) JSON.toJSON(responseObject);
        return responsejson.toString();
    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.PUT)
    public void updateOrganization( @PathVariable("organizationId") String orgId, @RequestBody Organization org) {
        orgService.updateOrg( org );

    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.POST)
    public void saveOrganization(@RequestBody Organization org) {
        orgService.saveOrg( org );
    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization( @PathVariable("organizationId") String orgId) {
        orgService.deleteOrg(orgId);

    }

}
