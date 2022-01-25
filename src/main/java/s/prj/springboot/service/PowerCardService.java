package s.prj.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import s.prj.springboot.model.PowerCard;
import s.prj.springboot.repository.PowerCardRepository;

@AllArgsConstructor
@Service
public class PowerCardService {
	
	private  PowerCardRepository powercardRepository;
	
	public List<PowerCard> getAllPowercards(){
		return powercardRepository.findAll();
	}

	public PowerCardService(PowerCardRepository powercardRepository) {
		super();
		this.powercardRepository = powercardRepository;
	}

	public PowerCardRepository getPowercardRepository() {
		return powercardRepository;
	}

	public void setPowercardRepository(PowerCardRepository powercardRepository) {
		this.powercardRepository = powercardRepository;
	}
}
