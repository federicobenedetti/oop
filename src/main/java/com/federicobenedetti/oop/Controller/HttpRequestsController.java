package com.federicobenedetti.oop.Controller;

import com.federicobenedetti.oop.Model.MetaDataDto;
import com.federicobenedetti.oop.Model.StatsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class HttpRequestsController {
	private DataSetController dataSetControllerInstance;

	public HttpRequestsController() {
		dataSetControllerInstance = new DataSetController();
	}

	@GetMapping("/metadata")
	public @ResponseBody
	ResponseEntity<ArrayList<MetaDataDto>>
	GetMetadata() {
		return new ResponseEntity<>(this.dataSetControllerInstance.GetMetaData(), HttpStatus.OK);
	}

	@GetMapping("/data/size")
	public @ResponseBody
	ResponseEntity<String>
	GetDataSize() {
		return new ResponseEntity<>("" + this.dataSetControllerInstance.GetDataSize(), HttpStatus.OK);
	}

	@GetMapping("/data")
	public @ResponseBody
	ResponseEntity<String>
	GetData() {
		System.out.println("Get /data");
		return new ResponseEntity<>("", HttpStatus.OK);
	}

	@GetMapping("/stats/{fieldName}")
	public @ResponseBody
	ResponseEntity<StatsDto>
	GetStatsByName(@PathVariable String fieldName) {
		System.out.println("Get /stats/" + fieldName);
		if (this.dataSetControllerInstance.IsFieldPresent(fieldName)) {
			return new ResponseEntity<>(this.dataSetControllerInstance.GetStats(fieldName), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/delete/{id}")
	ResponseEntity<String>
	DeleteElement(@PathVariable int id) {
		System.out.println("Delete /delete/" + id);
		if (this.dataSetControllerInstance.DeleteElementWithId(id)) {
			return new ResponseEntity<>("", HttpStatus.OK);
		}
		return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
	}


}
