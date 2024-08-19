package kaggle.cr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kaggle.cr.model.KaggleData;

@RestController
@RequestMapping("api/v1")
public class KaggleController {
	
	
	
	@Autowired
	private KaggleService kService;
	
	@GetMapping("/all")
	public List<KaggleData> allRecords(){
		return kService.getAllRecords();
	}
}
