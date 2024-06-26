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
	
	private void Converti() {
		
		String sV[]= tNum.getText().split(""), sBCD="";
		
		Hashtable <String,String> conversione =  new Hashtable <String,String>();
		
		conversione.put("0", "0000");
		conversione.put("1", "0001");
		conversione.put("2", "0010");
		conversione.put("3", "0011");
		conversione.put("4", "0100");
		conversione.put("5", "0101");
		conversione.put("6", "0110");
		conversione.put("7", "0111");
		conversione.put("8", "1000");
		conversione.put("9", "1001");
		
		for(int i=0; i < sV.length; i++) {
			
			sBCD += conversione.get(sV[i]);
			
		}
		
		lRis.setText(sBCD);
	}
	
	public static void main(String[] args) {
		launch(args);
		}
	}


