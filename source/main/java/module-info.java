module com.acromere.xenos {

	// Compile-time only
	requires static lombok;

	// Both compile-time and run-time
	requires com.acromere.xenon;
	requires java.logging;
	requires javafx.graphics;
	requires org.assertj.core;
	requires org.junit.jupiter.api;
	requires org.junit.platform.commons;
	requires org.testfx;
	requires org.testfx.junit5;
	requires org.mockito.junit.jupiter;
	requires org.mockito;

	exports com.acromere.xenos;

	opens com.acromere.xenos to org.testfx.junit5;
}
