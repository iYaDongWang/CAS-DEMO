package com.qige.cas.service;

import com.qige.cas.model.entity.UserPO;
import com.qige.cas.model.request.UserDTO;

/**
 * @author 王亚东
 * @date 2020/3/25 23:28
 */
public interface UserService {
    UserPO register(UserDTO userDTO);
}
