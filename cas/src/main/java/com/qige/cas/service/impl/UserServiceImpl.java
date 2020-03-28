package com.qige.cas.service.impl;

import com.qige.cas.model.entity.UserPO;
import com.qige.cas.model.request.UserDTO;
import com.qige.cas.repository.UserRepository;
import com.qige.cas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王亚东
 * @date 2020/3/25 23:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    /**
     *  注册用户
     * @param userDTO
     * @return
     */
    public UserPO register(UserDTO userDTO) {
        UserPO user = new UserPO();
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        userRepository.save(user);
        return userRepository.save(user);
    }
}
