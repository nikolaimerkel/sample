package de.nikolaimerkel.repository;

import de.nikolaimerkel.domain.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
