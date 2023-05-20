package br.edu.unifacol.spacep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.service.MediaService;

@RestController
@RequestMapping("/images")
public class SpacePController {

	@Autowired
	private MediaService service;

	@GetMapping("/all")
	public ResponseEntity<MediaDTO[]> getImagesAll() throws Exception {
		// Astronomy Picture of the Day
		MediaDTO[] nasaAPOD;
		nasaAPOD = service.saveMedia("https://api.nasa.gov/planetary/apod?api_key=**API_KEY**&start_date=2023-05-12&thumbs=True");
		return ResponseEntity
			.ok(nasaAPOD);
		// return new ResponseEntity<>(nasaAPOD, HttpStatus.OK);
	}

	// @GetMapping
	// public MediaDTO getImages() {
	// MediaDTO nasaAPOD = this.repository; // Astronomy Picture of the Day
	// return nasaAPOD;
	// }

	@GetMapping("/hello")
	public String welcome() {
		return "Hello World";
	}

	// public ImagesDTO getImages(@PathVariable String test) {
	// String url = "https://www.example.org/";
	// RestTemplate restTemplate = new RestTemplate();
	// ImagesDTO response = restTemplate.getForObject(url, ImagesDTO.class);
	// return response;
	// }
}
