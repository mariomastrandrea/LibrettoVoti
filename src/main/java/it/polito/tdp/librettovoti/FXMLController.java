package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.model.Libretto;
import it.polito.tdp.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController 
{
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nomeEsameField;

    @FXML
    private TextField votoField;

    @FXML
    private DatePicker dataPicker;

    @FXML
    private TextArea textArea;

    private Libretto librettoModel;
    
    
    public void setModel(Libretto newModelLibretto) { this.librettoModel = newModelLibretto; }
    
    @FXML
    void handleInserisci(ActionEvent event) 
    {
    	//Leggi e controlla i dati
    	String nomeEsame = this.nomeEsameField.getText();
    	if(nomeEsame.length() == 0)
    	{
    		textArea.setText("Errore: campo nome vuoto!");
    		return;
    	}
    	
    	int votoInt = 0;
    	String votoEsame = this.votoField.getText();
    	if(votoEsame.length() == 0)
    	{
    		textArea.setText("Errore: campo voto vuoto!");
    		return;
    	}
    	
    	try
    	{
	    	votoInt = Integer.parseInt(votoEsame);
    	}
    	catch(NumberFormatException nfe)
    	{
    		textArea.setText("Errore: il voto deve essere un numero intero!");
    		return;
    	}
    	
    	if(votoInt < 18 || votoInt > 30)
    	{
    		textArea.setText("Errore: il voto deve essere compreso tra 18 e 30!");
    		return;
    	}
    	
    	
    	if(dataPicker.getValue() == null)
    	{
    		textArea.setText("Errore: campo data vuoto!");
    		return;
    	}
    	
    	/*
    	LocalDate data;
    	try
    	{
    		data = LocalDate.parse(dataEsame);
    	}
    	catch(DateTimeParseException dtpe)
    	{
    		textArea.setText("Errore: la data deve essere nel formato yyyy-mm-dd!");
    		return;
    	}
    	*/
    	
    	LocalDate data = this.dataPicker.getValue();
    	
    	//Esegui l'azione
    	Voto voto = new Voto(nomeEsame, votoInt, data);
    	librettoModel.add(voto);
    	
    	//mostra voti esami
    	this.textArea.setText(librettoModel.toString());
    	this.nomeEsameField.clear();
    	this.votoField.clear();
    	this.dataPicker.setValue(null);
    }

    @FXML
    void initialize() 
    {
    	assert nomeEsameField != null : "fx:id=\"nomeEsameField\" was not injected: check your FXML file 'Scene_Libretto.fxml'.";
        assert votoField != null : "fx:id=\"votoField\" was not injected: check your FXML file 'Scene_Libretto.fxml'.";
        assert dataPicker != null : "fx:id=\"dataPicker\" was not injected: check your FXML file 'Scene_Libretto.fxml'.";
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'Scene_Libretto.fxml'.";
    }
}

