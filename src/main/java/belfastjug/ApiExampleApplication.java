package belfastjug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("meetups")
public class ApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiExampleApplication.class, args);
	}
	
	@RequestMapping(path = "{meetupName}/live_now", method = RequestMethod.GET)
	public ResponseEntity<?> liveNow(final @PathVariable String meetupName) {
		if (meetupName.equals("belfastjug"))
			return ResponseEntity.ok("YES!");	
		else
			return ResponseEntity.notFound().build();
	}
}
