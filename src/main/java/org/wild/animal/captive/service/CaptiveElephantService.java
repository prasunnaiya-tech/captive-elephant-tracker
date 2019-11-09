package org.wild.animal.captive.service;

import java.util.List;

import org.wild.animal.captive.entity.ElephantDetails;

public interface CaptiveElephantService {
		public List<ElephantDetails> searchAllElephantDetail();
		public ElephantDetails searchElephantById(long id);
		public ElephantDetails searchElephantByGPSLocation(String gpsLocation);
		public ElephantDetails saveElephantDetails(ElephantDetails elephantDetails);
		public void removeElephantDetails(ElephantDetails elephantDetails);

}
