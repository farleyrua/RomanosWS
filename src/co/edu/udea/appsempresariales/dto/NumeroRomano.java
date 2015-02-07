package co.edu.udea.appsempresariales.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class NumeroRomano implements Serializable {

	private static final long serialVersionUID = -5824446801031871146L;
	private String numRomano;

	public NumeroRomano() {
		super();
	}

	public NumeroRomano(String numRomano) {
		this.numRomano = numRomano;
	}

	public String getRomanNumber() {
		return numRomano;
	}

	public void setRomanNumber(String numRomano) {
		this.numRomano = numRomano;
	}
}