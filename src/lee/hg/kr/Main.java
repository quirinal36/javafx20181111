package lee.hg.kr;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import lee.hg.kr.controller.LoginController;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	BorderPane root;
	private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("GameApp");
		try {
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			initLoginLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		showLoginView();
	}
	/**
	 * 상위 레이아웃을 추가한다
	 * @throws IOException 
	 */
	public void initLoginLayout() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("view/RootLayout.fxml"));
		root = (BorderPane) loader.load();
		Scene scene = new Scene(root,600,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public void showLoginView()  {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("view/LoginView.fxml"));
		try {
			AnchorPane loginView = (AnchorPane) loader.load();
			root.setCenter(loginView);
			
			LoginController controller = loader.getController();
			if(controller != null) {
				controller.setMainApp(this);
			}else {
				System.out.println("controller null");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
