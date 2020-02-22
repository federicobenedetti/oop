package com.federicobenedetti.oop.Controllers;

import com.federicobenedetti.oop.Models.DTOs.DataDto;
import com.federicobenedetti.oop.Models.DTOs.MetaDataDto;
import com.federicobenedetti.oop.Models.DTOs.StatsDto;
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
	ResponseEntity<ArrayList<DataDto>>
	GetData() {
		return new ResponseEntity<>(this.dataSetControllerInstance.GetData(), HttpStatus.OK);
	}

	@GetMapping("/stats/{fieldName}")
	public @ResponseBody
	ResponseEntity<StatsDto>
	GetStatsByName(@PathVariable String fieldName) {
		if (this.dataSetControllerInstance.IsFieldPresent(fieldName)) {
			return new ResponseEntity<>(this.dataSetControllerInstance.GetStats(fieldName), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/stats/population/{fieldName}")
	public @ResponseBody
	ResponseEntity<StatsDto>
	GetPopulationStats(@PathVariable String fieldName) {
		if (this.dataSetControllerInstance.IsFieldPresent(fieldName)) {
			return new ResponseEntity<>(this.dataSetControllerInstance.GetStats(fieldName), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/delete/{id}")
	ResponseEntity<String>
	DeleteElement(@PathVariable int id) {
		if (this.dataSetControllerInstance.DeleteElementWithId(id)) {
			return new ResponseEntity<>("", HttpStatus.OK);
		}
		return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
	}
}
