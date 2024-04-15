package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entity.UserDtlsEntity;

public interface UserDtlsRepo extends JpaRepository<UserDtlsEntity, Integer> {

}
