package com.example.demo.test.mapper;

import com.example.demo.test.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author app
 * @since 2019-09-04
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    Users getUserByInformatin(String username, String password);

}
