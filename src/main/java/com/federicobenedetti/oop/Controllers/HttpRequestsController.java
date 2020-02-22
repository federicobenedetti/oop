package com.federicobenedetti.oop.Controllers;

import com.federicobenedetti.oop.Models.DTOs.DataDto;
import com.federicobenedetti.oop.Models.DTOs.MetaDataDto;
import com.federicobenedetti.oop.Models.DTOs.StatsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * This is the controller for all the Http requests
 * It provides a list of API to manage the parsed dataset
 */
@RestController
@RequestMapping("/api")
public class HttpRequestsController {
	private DataSetController dataSetControllerInstance;

	public HttpRequestsController() {
		dataSetControllerInstance = new DataSetController();
	}

	/**
	 * This API return the list of the metadata present
	 *
	 * @return list of MetaDataDto
	 */
	@GetMapping("/metadata")
	public @ResponseBody
	ResponseEntity<ArrayList<MetaDataDto>>
	GetMetadata() {
		return new ResponseEntity<>(this.dataSetControllerInstance.GetMetaData(), HttpStatus.OK);
	}

	/**
	 * This API return the number of rows in our dataset
	 *
	 * @return string
	 */
	@GetMapping("/data/size")
	public @ResponseBody
	ResponseEntity<String>
	GetDataSize() {
		return new ResponseEntity<>("" + this.dataSetControllerInstance.GetDataSize(), HttpStatus.OK);
	}

	/**
	 * this API return all the data present inside our dataset
	 *
	 * @return list of DataDto
	 */
	@GetMapping("/data")
	public @ResponseBody
	ResponseEntity<ArrayList<DataDto>>
	GetData() {
		return new ResponseEntity<>(this.dataSetControllerInstance.GetData(), HttpStatus.OK);
	}

	/**
	 * This API will make statistics based on the field name sent
	 *
	 * @param fieldName this is the name of the field we're referring to
	 * @return StatsDto
	 */
	@GetMapping("/stats/{fieldName}")
	public @ResponseBody
	ResponseEntity<StatsDto>
	GetStatsByName(@PathVariable String fieldName) {
		if (this.dataSetControllerInstance.IsFieldPresent(fieldName)) {
			return new ResponseEntity<>(this.dataSetControllerInstance.GetStats(fieldName), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	/**
	 * This API will delete the row with the associated ID
	 *
	 * @param id of the row we want to delete
	 * @return string
	 */
	@DeleteMapping("/delete/{id}")
	ResponseEntity<String>
	DeleteElement(@PathVariable int id) {
		if (this.dataSetControllerInstance.DeleteElementWithId(id)) {
			return new ResponseEntity<>("", HttpStatus.OK);
		}
		return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
	}
}
