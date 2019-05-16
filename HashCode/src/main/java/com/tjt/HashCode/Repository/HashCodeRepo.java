package com.tjt.HashCode.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tjt.HashCode.Entity.HashCode;

public interface HashCodeRepo extends JpaRepository<HashCode, String> {

}
