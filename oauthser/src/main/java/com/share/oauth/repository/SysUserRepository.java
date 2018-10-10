package com.share.oauth.repository;



import com.share.oauth.domain.SysUser;
import com.share.oauth.repository.support.WiselyRepository;

import java.util.Optional;

public interface SysUserRepository extends WiselyRepository<SysUser,Long> {
    Optional<SysUser> findOneWithRolesByUsername(String username);
}
