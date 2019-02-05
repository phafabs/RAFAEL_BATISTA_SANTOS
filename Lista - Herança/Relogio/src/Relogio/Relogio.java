package Relogio;

public interface Relogio {
	
	void setHorario(String horario);
	String getHorario();
	
	void setHorarioAlarme(String horarioAlarme);
	String getHorarioAlarme();
	
	boolean ligarAlarme();
	boolean desligarAlarme();
	
	void setVolumeRelogio(int volumeRelogio);
	int getVolumeRelogio();
}