package com.example.demo.test.service.impl;

import com.example.demo.test.entity.Users;
import com.example.demo.test.mapper.UsersMapper;
import com.example.demo.test.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author app
 * @since 2019-09-04
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
