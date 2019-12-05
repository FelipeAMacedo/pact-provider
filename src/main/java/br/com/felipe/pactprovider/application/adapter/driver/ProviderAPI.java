package br.com.felipe.pactprovider.application.adapter.driver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipe.pactprovider.application.dto.FindDTO;
import br.com.felipe.pactprovider.domain.service.ProviderService;

@RestController
@RequestMapping("/v1/provider")
public class ProviderAPI {
	
	private ProviderService providerService;
	
	@Autowired
	public ProviderAPI(ProviderService providerService) {
		this.providerService = providerService;
	}

	@GetMapping
	public ResponseEntity<List<String>> findAll() {
		List<String> result = new ArrayList<>();
		result.add("result");
		result.add("from");
		result.add("provider");
		
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FindDTO> find(String id) {
		FindDTO dto = new FindDTO();
		dto.setResult("from");
		dto.setProvider("yes");
		
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping
	public ResponseEntity<String> insert(@RequestBody String value) {
		providerService.insert();
		String result = "insert from provider";
		return ResponseEntity.ok(result);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable String id, @RequestBody String value) {
		String result = "update from provider";
		return ResponseEntity.ok(result);
	}

	@DeleteMapping("/{value}")
	public ResponseEntity<String> delete(@PathVariable String value) {
		String result = "delete from provider";
		return ResponseEntity.ok(result);
	}
}
