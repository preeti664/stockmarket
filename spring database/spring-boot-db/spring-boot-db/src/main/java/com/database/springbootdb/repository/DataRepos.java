package com.database.springbootdb.repository;

import com.database.springbootdb.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DataRepos extends JpaRepository<Data, Integer> {

}
