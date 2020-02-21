package com.federicobenedetti.oop.Controller;

import com.federicobenedetti.oop.Model.MetaDataDto;
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
		return new ResponseEntity<ArrayList<MetaDataDto>>(this.dataSetControllerInstance.GetMetaData(), HttpStatus.OK);
	}

	@GetMapping("/data")
	public @ResponseBody
	ResponseEntity<String>
	GetData() {
		System.out.println("Get /data");
		return new ResponseEntity<String>("GET /data response", HttpStatus.OK);
	}

	@GetMapping("/stats/{fieldName}")
	public @ResponseBody
	ResponseEntity<String>
	GetStatsByName(@PathVariable String fieldName) {
		System.out.println("Get /stats/" + fieldName);
		return new ResponseEntity<String>("GET /stats/" + fieldName + " response", HttpStatus.OK);
	}

}
