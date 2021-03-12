package com.example.rhworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rhworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}