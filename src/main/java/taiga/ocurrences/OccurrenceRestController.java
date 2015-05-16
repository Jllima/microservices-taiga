package taiga.ocurrences;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taiga/occurrences")
public class OccurrenceRestController {
	
	@Autowired
	private OccurrenceRepository rep;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Occurrence> getAll() {
		return rep.findAll();
	}
	@RequestMapping(method=RequestMethod.POST)
	public Occurrence create(@RequestBody Occurrence occurrrence) {
		return rep.save(occurrrence);
	}
}
