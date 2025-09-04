package com.reactspring.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reactspring.Model.UserDao;

@Repository
public interface UserDaoRepo extends CrudRepository<UserDao, Integer> {
	UserDao findByUsername(String username);

}
