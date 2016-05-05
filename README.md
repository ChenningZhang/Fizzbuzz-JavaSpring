# Fizzbuzz using Java Spring MVC Framework

## To Run the Application
* clone or download this repository.
* In Eclipse, select Run -> Run As -> Maven build...
* In Goals, type in 'tomcat7:run', shown in the picture below.
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/tomcat_inst.png)
* Wait till the Application starts, open up browser, type in url "localhost:8080/api?word=[YOUR SELECTED PARAM]&max_value=[YOUR SELECTED PARAM]"
* It should give you the corresponding JSON output and HTTP status(:

## Sample Runs and Results Screenshots
* Valid request parameters are given(word=fizz, max_value=30) => HTTP status 200 OK, JSON status "ok", correct array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/fizz30.png)
* Valid request parameters are given(word=buzz, max_value=50) => HTTP status 200 OK, JSON status "ok", correct array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/buzz50.png)
* Valid request parameters are given(word=fizzbuzz, max_value=100) => HTTP status 200 OK, JSON status "ok", correct array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/fizzbuzz100.png)
* The "word" parameter is missing => HTTP status 400 Bad Request, JSON status "error", empty array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/wordmissing.png)
* The "word" parameter is invalid => HTTP status 400 Bad Request, JSON status "error", empty array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/wordinvalid.png)
* The "max_value" parameter is missing => HTTP status 400 Bad Request, JSON status "error", empty array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/valuemissing.png)
* The "max_value" parameter is negative => HTTP status 400 Bad Request, JSON status "error", empty array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/valuenegative.png)
* The "max_value" parameter is float => HTTP status 400 Bad Request, JSON status "error", empty array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/valuenotint.png)
* The "max_value" parameter is not a number => HTTP status 400 Bad Request, JSON status "error", empty array
	![alt tag](https://raw.githubusercontent.com/ChenningZhang/Fizzbuzz-JavaSpring/master/images/valuenotnumber.png)
