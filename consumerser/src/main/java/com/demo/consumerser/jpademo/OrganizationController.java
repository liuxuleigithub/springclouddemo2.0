package com.demo.consumerser.jpademo;

import com.demo.consumerser.api.OrganizationApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="organization")
@Api(value = "OrganizationController", description = "Organization接口")
public class OrganizationController {

    @Autowired
    private OrganizationApi organizationApi;

    @ApiOperation(value="getOrganization", notes="获取机构信息接口(测试jpa查询)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "机构id", required = true ,dataType = "string")
    })
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public String getOrganization(@PathVariable("id") String id) {

        return organizationApi.getOrganization(id);

    }

    @ApiOperation(value="listPageByPagehelper", notes="获取机构列表接口(测试Pagehelper+mybatis分页)")
    @RequestMapping(value="/listPageByPagehelper",method = RequestMethod.GET)
    public String listPageByPagehelper() {

        return organizationApi.listPageByPagehelper();

    }

    @ApiOperation(value="findListByPagingAndSorting", notes="获取机构列表接口(测试PagingAndSortingRepository分页)")
    @RequestMapping(value="/findListByPagingAndSorting",method = RequestMethod.GET)
    public String findListByPagingAndSorting() {

        return organizationApi.findListByPagingAndSorting();

    }

}
