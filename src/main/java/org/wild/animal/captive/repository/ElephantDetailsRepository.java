package org.wild.animal.captive.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wild.animal.captive.entity.ElephantDetails;

@Repository
public interface ElephantDetailsRepository extends JpaRepository<ElephantDetails, Long> {
	Optional<ElephantDetails> findByCurrentGPSLocation(String currentGPSLocation);
}
