package com.tjt.GitDemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tjt.GitDemo.Entity.GitEntity;

public interface Gitdao extends JpaRepository<GitEntity, String> {

}
