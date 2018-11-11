package lee.hg.kr.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lee.hg.kr.Main;

public class LoginController {
	@FXML
	private TextField idTextField;
	@FXML
	private TextField pwdTextField;
	@FXML
	private Button loginButton;
	
	private Main main;
	
	public LoginController() {}
	
	@FXML
	private void initialize() {
		
	}
	
	public void setMainApp(Main main) {
		this.main = main;
	}
}
