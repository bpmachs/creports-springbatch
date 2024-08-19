package kaggle.cr.service;

import java.util.List;

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
}
