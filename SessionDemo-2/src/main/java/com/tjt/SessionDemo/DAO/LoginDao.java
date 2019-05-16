package com.tjt.SessionDemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tjt.SessionDemo.Entity.LoginEntity;

public interface LoginDao extends JpaRepository<LoginEntity, String> {

}
