package com.qige.cas.repository;

import com.qige.cas.model.entity.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 王亚东
 * @date 2020/3/25 23:30
 */
public interface UserRepository extends JpaRepository<UserPO,Integer> {

}
