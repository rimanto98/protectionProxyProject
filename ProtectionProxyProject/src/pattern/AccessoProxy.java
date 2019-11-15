package pattern;

import java.awt.Image;

public class AccessoProxy implements Accesso{
	
	private AccessoReale ac;
	
	private Boolean admin;
	
	public AccessoProxy() {
		super();
		
		admin = false;
	}
	
	public Boolean verificaAdmin()
	{		
		verificaIstanziamento();
		
		if (ac.verificaAdmin())
		{
			admin = true;
			return true;
		}
		
		admin = false;
		return false;
	}

	@Override
	public String getNome() {
		verificaIstanziamento();
		
		return ac.getNome();
	}

	@Override
	public void setNome(String nome) {
		verificaIstanziamento();
			
		ac.setNome(nome);
	}

	@Override
	public String getCognome() {
		verificaIstanziamento();
		
		return ac.getCognome();
	}

	@Override
	public void setCognome(String cognome) {
		verificaIstanziamento();
		
		ac.setCognome(cognome);
		
	}

	@Override
	public String getPassword() {
		verificaIstanziamento();
		
		return ac.getPassword();
	}

	@Override
	public void setPassword(String password) {
		verificaIstanziamento();
		
		ac.setPassword(password);
		
	}

	private void verificaIstanziamento() {
		if (ac == null)
			ac = new AccessoReale();
		
	}

	@Override
	public Boolean getAdmin() {
		return admin;
	}

	@Override
	public Image getUserImg() {
		return ac.getUserImg();
	}

	@Override
	public Image getAdminImg() {
		return ac.getAdminImg();
	}

}
