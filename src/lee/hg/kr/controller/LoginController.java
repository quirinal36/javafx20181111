package lee.hg.kr.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

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
	
	@FXML
	private void handleLoginButton() {
//		System.out.println("loginbutton click~!");
		String loginUrl = "http://game.bacoder.kr/login.jsp?login=suhan&pwd=1111";
		try (Scanner scanner = new Scanner(new URL(loginUrl).openStream(), "UTF-8")){
//			scanner.useDelimiter("\\A");
			String result = scanner.next();
//			System.out.println(result);
			JSONObject json = new JSONObject(result);
			System.out.println(json.toString());
			if(json.getInt("id") > 0) {
				System.out.println("success");
			}else {
				System.out.println("fail");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}