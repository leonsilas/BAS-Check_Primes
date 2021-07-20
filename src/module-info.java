module Deployment {
	requires javafx.fxml;
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
	
}
