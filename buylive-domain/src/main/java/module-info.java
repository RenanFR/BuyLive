module com.buylive.domain {
	
	exports com.buylive.domain to com.buylive.persist, com.buylive.service;
	requires lombok;
	requires jackson.annotations;
	
}