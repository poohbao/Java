package com.ohgiraffers.sectionsecurity.user.model.dto.dao;

import com.ohgiraffers.sectionsecurity.user.model.dto.SignupDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int regist(SignupDTO signupDTO);

}
