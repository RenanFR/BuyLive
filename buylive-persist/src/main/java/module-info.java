module com.buylive.persist {
	
	exports com.buylive.persist to com.buylive.service;
	requires transitive com.buylive.domain;
	requires spring.data.mongodb;
	requires spring.data.commons;
	requires transitive spring.context;
	
}