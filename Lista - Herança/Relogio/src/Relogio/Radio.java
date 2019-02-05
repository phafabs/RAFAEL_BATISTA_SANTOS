package Relogio;

public interface Radio {
	
	String getEmissora();
	void setEmissora(String emissora);
	
	String getTipoEmissora();
	
	int getVolumeRadio();
	void setVolumeRadio(int volumeRadio);
}