package kaggle.cr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kaggle.cr.model.KaggleData;
import kaggle.cr.repo.KaggleRepo;

@Service
public class KaggleService {

	
	@Autowired
	private KaggleRepo kRepo;
	
	public List<KaggleData> getAllRecords() {
		return kRepo.findAll();
	}
	
	public KaggleData getById(Long id) {
		Optional<KaggleData> kd =  kRepo.findById(id);
		
		return kd.get();
	}
}
