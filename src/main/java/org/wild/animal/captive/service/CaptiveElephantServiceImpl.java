package org.wild.animal.captive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wild.animal.captive.entity.ElephantDetails;
import org.wild.animal.captive.repository.ElephantDetailsRepository;

@Service
public class CaptiveElephantServiceImpl implements CaptiveElephantService{
	
	@Autowired
	private ElephantDetailsRepository edRepo;

	@Override
	public List<ElephantDetails> searchAllElephantDetail() {
		// TODO Auto-generated method stub
		return edRepo.findAll();
	}

	@Override
	public ElephantDetails searchElephantById(long id) {
		// TODO Auto-generated method stub
		Optional<ElephantDetails> ed = edRepo.findById(id);
		if(ed.isPresent()) {
			return ed.get();
		} else {
			return null;
		}
	}

	@Override
	public ElephantDetails saveElephantDetails(ElephantDetails elephantDetails) {
		// TODO Auto-generated method stub
		return edRepo.save(elephantDetails);
	}

	@Override
	public void removeElephantDetails(ElephantDetails elephantDetails) {
		// TODO Auto-generated method stub
		edRepo.delete(elephantDetails);
	}

	@Override
	public ElephantDetails searchElephantByGPSLocation(String gpsLocation) {
		// TODO Auto-generated method stub
		return edRepo.findByCurrentGPSLocation(gpsLocation).get();
	}

}
