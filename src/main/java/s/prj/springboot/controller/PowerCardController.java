package s.prj.springboot.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.prj.springboot.model.PowerCard;
import s.prj.springboot.repository.PowerCardRepository;
import s.prj.springboot.service.PowerCardService;
import s.prj.springboot.service.SequenceGeneratorService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
public class PowerCardController {
	
	public PowerCardController(PowerCardService powercardService) {
		this.powercardService = powercardService;
	}
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PowerCardRepository powercardRepository;
	
	@Autowired
	private SequenceGeneratorService seqGeneratorService;
	
	private final PowerCardService powercardService;
	
	@GetMapping("/powercards")
	public List<PowerCard> fetchAllPowerCards(){
		return powercardService.getAllPowercards();
	}
	
	
	
	@PostMapping("powercards/add")
	public PowerCard create( @RequestBody PowerCard newPowerCardObject) {
		newPowerCardObject.setId(seqGeneratorService.generateSequence(PowerCard.SEQUENCE_NAME));
	 return powercardRepository.save(newPowerCardObject);
	}
	
	@PutMapping("powercards/update")
	public PowerCard update(@RequestBody PowerCard modifiedPowerCardObject) {
		return powercardRepository.save(modifiedPowerCardObject);
	}
	
	@DeleteMapping("powercards/delete/{id}")
    public String delete(@PathVariable int id){
		powercardRepository.deleteById(id);
        
        return "Deleted Successfully";
    }
	
	 @GetMapping("/powercards/{id}")

	    public Optional<PowerCard> getPowerCard(@PathVariable int id) {

	        logger.info("find PowerCard by id : "+id);
	        Optional<PowerCard> card = powercardRepository.findById(id);

	        return card;
	    }
	
	}

