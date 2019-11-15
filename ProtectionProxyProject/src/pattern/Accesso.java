package pattern;

import java.awt.Image;

public interface Accesso {
	
	public String getNome();

	public void setNome(String nome);

	public String getCognome();

	public void setCognome(String cognome);

	public String getPassword();

	public void setPassword(String password);

	public Boolean verificaAdmin();
	
	public Boolean getAdmin();
	
	public Image getUserImg();
	
	public Image getAdminImg();
	

}
