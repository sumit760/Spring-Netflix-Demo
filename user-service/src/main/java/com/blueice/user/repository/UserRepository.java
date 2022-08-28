package com.blueice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueice.user.VO.ResponseTemplateVO;
import com.blueice.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>  {

    ResponseTemplateVO getUserWithDepartmentById(User userId);

    User findByUserId(User userId);


}
