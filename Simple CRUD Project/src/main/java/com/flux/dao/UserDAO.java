package com.flux.dao;

import org.springframework.data.repository.CrudRepository;
import com.flux.model.UserTable;

public interface UserDAO extends CrudRepository<UserTable,Integer>{

}
