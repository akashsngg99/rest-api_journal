package com.example.Journal.App.repository;

import com.example.Journal.App.entity.journalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface JournalRepo extends JpaRepository<journalEntity, Long> {

}
