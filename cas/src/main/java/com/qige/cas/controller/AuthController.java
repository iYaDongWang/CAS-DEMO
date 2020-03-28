package com.qige.cas.controller;

import com.qige.cas.constant.Code;
import com.qige.cas.model.entity.UserPO;
import com.qige.cas.model.request.UserDTO;
import com.qige.cas.model.response.ResponseResult;
import com.qige.cas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 王亚东
 * @date 2020/3/25 22:25
 */
@RestController
@RequestMapping("/v1")
public class AuthController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseResult register(@RequestBody UserDTO userDTO) {
        return  new ResponseResult<UserPO>(Code.SUCCESS,userService.register(userDTO) );
    }


    @GetMapping("/getTicket")
    public ResponseResult<String> getTicket(String username, String password) {
        ResponseResult<String> responseResult = new ResponseResult<String>(Code.SUCCESS, username);
        return responseResult;
    }
}
