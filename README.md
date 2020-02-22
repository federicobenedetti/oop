# Object Oriented Spring-Boot based project
This project is using **Spring Boot** as the Java Framework to handle Http requests.

I was focused on simplicity while writing it, so i've used an MVC pattern and modified it to meet my needs. I wrote 4 controllers, each one will handle something in particular to divide and simplify all the methods and calls.

The most important one is the `DataSetController`
It actually handle our dataset, and exposes all the method needed by the `HttpRequestController` to answer the user.
Then we have `DataSetDownloadController` and `DataSetParserController`: while the first is in charge to download the dataset from a server, the latter will take the output, sanitize each line (as the dataset it's not well-formed), and compose our array.

Then, talking about object, i wrote a very basic interface (`ISerializableBean`) that implements Serializable. This is very important as SpringBoot need Serializable object to be able to communicate back and forth with the user.
Every class that implements it will actually be used for communication.
In fact, all DTOs (`Data Trasfer Object`) implements it.

The DataSet itself is stored using the `DataSetModel` class. 
I've chosen to use HashMap to handle the dataset key-value pairs as it is easy to implement and to use.

# Examples
> All the answers won't be prettified here

**API `localhost:8080/api/metadata`**

**Answer**

`[{"type":"String","alias":"Bmi, Sex, Age, Quantile, Time, Geo","sourceField":"BmiSexAgeQuantileTimeGeo"},{"type":"Double","alias":"EE","sourceField":"EE"},{"type":"Double","alias":"DE","sourceField":"DE"},{"type":"Double","alias":"BE","sourceField":"BE"},{"type":"Double","alias":"BG","sourceField":"BG"},{"type":"Double","alias":"EL","sourceField":"EL"},{"type":"Double","alias":"MT","sourceField":"MT"},{"type":"Double","alias":"LV","sourceField":"LV"},{"type":"Double","alias":"FR","sourceField":"FR"},{"type":"Double","alias":"HU","sourceField":"HU"},{"type":"Double","alias":"ES","sourceField":"ES"},{"type":"Double","alias":"AT","sourceField":"AT"},{"type":"Double","alias":"CY","sourceField":"CY"},{"type":"Double","alias":"SI","sourceField":"SI"},{"type":"Double","alias":"CZ","sourceField":"CZ"},{"type":"Double","alias":"SK","sourceField":"SK"},{"type":"Double","alias":"PL","sourceField":"PL"},{"type":"Double","alias":"RO","sourceField":"RO"},{"type":"Double","alias":"TR","sourceField":"TR"}]`

**API `localhost:8080/api/data`**

**Answer (cut)**

`[{"rowNumber":0,"id":0,"dataSetValues":{"EE":34.4,"DE":40.5,"BE":50.7,"BG":41.2,"EL":43.4,"MT":38.9,"LV":50.5,"FR":0.0,"HU":40.8,"ES":37.8,"AT":46.2,"CY":41.8,"SI":36.0,"CZ":33.5,"SK":33.1,"PL":42.4,"RO":50.5,"TR":46.9},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,TOTAL,QU1,2008"},{"rowNumber":1,"id":1,"dataSetValues":{"EE":44.1,"DE":47.9,"BE":51.8,"BG":43.9,"EL":41.1,"MT":33.3,"LV":35.2,"FR":0.0,"HU":39.5,"ES":47.9,"AT":53.6,"CY":49.5,"SI":42.2,"CZ":41.1,"SK":49.4,"PL":45.0,"RO":54.6,"TR":44.4},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,TOTAL,QU2,2008"},{"rowNumber":2,"id":2,"dataSetValues":{"EE":41.4,"DE":48.3,"BE":43.2,"BG":47.0,"EL":52.8,"MT":42.5,"LV":43.3,"FR":0.0,"HU":41.0,"ES":53.8,"AT":50.8,"CY":53.8,"SI":46.8,"CZ":41.8,"SK":55.7,"PL":48.8,"RO":59.3,"TR":46.6},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,TOTAL,QU3,2008"},{"rowNumber":3,"id":3,"dataSetValues":{"EE":48.3,"DE":59.1,"BE":47.1,"BG":54.6,"EL":53.3,"MT":50.4,"LV":59.6,"FR":0.0,"HU":48.7,"ES":60.8,"AT":55.7,"CY":56.1,"SI":51.0,"CZ":50.9,"SK":56.6,"PL":52.8,"RO":65.6,"TR":46.8},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,TOTAL,QU4,2008"},{"rowNumber":4,"id":4,"dataSetValues":{"EE":56.9,"DE":61.7,"BE":65.1,"BG":58.7,"EL":61.2,"MT":53.3,"LV":63.6,"FR":0.0,"HU":53.0,"ES":65.0,"AT":64.4,"CY":64.6,"SI":70.4,"CZ":55.7,"SK":62.3,"PL":56.0,"RO":54.7,"TR":48.3},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,TOTAL,QU5,2008"},{"rowNumber":5,"id":5,"dataSetValues":{"EE":48.0,"DE":52.1,"BE":54.5,"BG":50.7,"EL":48.0,"MT":46.0,"LV":43.5,"FR":57.7,"HU":45.2,"ES":53.2,"AT":54.1,"CY":52.8,"SI":50.6,"CZ":47.4,"SK":52.5,"PL":50.1,"RO":52.8,"TR":46.6},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,TOTAL,TOTAL,2008"},{"rowNumber":6,"id":6,"dataSetValues":{"EE":60.5,"DE":55.7,"BE":56.9,"BG":59.3,"EL":44.6,"MT":49.9,"LV":0.0,"FR":57.7,"HU":56.9,"ES":55.7,"AT":0.0,"CY":60.2,"SI":53.8,"CZ":53.8,"SK":61.6,"PL":51.9,"RO":57.2,"TR":58.5},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,TOTAL,UNK,2008"},{"rowNumber":7,"id":7,"dataSetValues":{"EE":70.5,"DE":57.2,"BE":62.6,"BG":61.9,"EL":59.5,"MT":61.1,"LV":62.8,"FR":0.0,"HU":60.7,"ES":54.7,"AT":66.2,"CY":72.2,"SI":61.9,"CZ":0.0,"SK":60.6,"PL":65.3,"RO":62.6,"TR":55.7},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,Y18-44,QU1,2008"},{"rowNumber":8,"id":8,"dataSetValues":{"EE":66.9,"DE":59.5,"BE":62.8,"BG":63.3,"EL":65.4,"MT":44.4,"LV":56.1,"FR":0.0,"HU":56.1,"ES":62.0,"AT":69.8,"CY":62.7,"SI":62.5,"CZ":62.9,"SK":70.7,"PL":62.9,"RO":65.8,"TR":54.3},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,Y18-44,QU2,2008"},{"rowNumber":9,"id":9,"dataSetValues":{"EE":61.7,"DE":56.6,"BE":58.0,"BG":63.5,"EL":67.7,"MT":46.5,"LV":62.2,"FR":0.0,"HU":56.6,"ES":63.5,"AT":61.8,"CY":63.7,"SI":61.4,"CZ":69.0,"SK":69.1,"PL":68.7,"RO":68.6,"TR":56.3},"bmiSexAgeQuantileTimeGeo":"18P5-25,F,Y18-44,QU3,2008"},{"rowNumber":10,"id":10,"dataSetValues":{"EE":64.0,"DE":66.0,"BE":57.4,"BG":64.0,"EL":67.6,"MT":56.6,"LV":70.3,"FR":0.0,"HU":60.8,"ES":68.0,"AT":65.8,"CY":63.7,"SI":59.9,"CZ":58.2,"SK":67.0,"PL":68.0,"RO":71.4,"TR":57.3},"bmiSexAgeQuanti ........`

**API `localhost:8080/api/data/size`**

**Answer**

`133`

**API `localhost:8080/api/stats/{fieldName}`**

**Answer**

`{"field":"RO","count":131,"max":71.4,"min":24.5,"sum":4594.700000000002,"std":1.3690588342432584,"avg":35.07404580152673}`


**API `localhost:8080/api/delete/{Id}`**

**Answer**

`Empty`

All the APIs are written to handle errors, so check the status inside the http request. 200 is OK, 400 is BAD_REQUEST.
