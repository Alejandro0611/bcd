package verifica;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class bcd extends Application{

	
TextField tNum= new TextField();
	
	Label lRis= new Label();
	public void start(Stage finestra){

		GridPane griglia= new GridPane();
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena = new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("verifica tpsit");
		finestra.show();
		
		Label lNumero= new Label("Inserisci numero");
		Label lBCD= new Label("numero in bcd");
		
		Button bConverti= new Button("CONVERTI");
		
		griglia.add(lNumero, 0, 0);
		griglia.add(tNum, 0, 1);
		griglia.add(bConverti, 0, 2);
		griglia.add(lBCD, 0, 3);
		griglia.add(lRis, 0, 4);
		
		bConverti.setOnAction(e -> Converti());
	}
	
