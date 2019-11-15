package pattern;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AccessoReale implements Accesso{
	
	private Image userImg;
	
	private Image adminImg;
	
	private String nome;
	
	private String cognome;
	
	private String password;

	private boolean messaggioVisualizzato = false;
	
	public AccessoReale() {
		super();
		
		nome = null;
		cognome = null;
		password = null;
		
		try {
			userImg = ImageIO.read(new File("immagini" + File.separator  + "user.jpeg"));
			adminImg = ImageIO.read(new File("immagini" + File.separator  + "admin.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String name) {
		nome = name;
	}

	@Override
	public String getCognome() {
		return cognome;
	}

	@Override
	public void setCognome(String cognome) {

		this.cognome = cognome;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {

		this.password = password;
	}
	
	public Boolean verificaAdmin()
	{
		if (password.equals("admin")&& nome.equals("Marco") && cognome.equals("Grande"))
		{	
			return true;
		}
		
		return false;
	}

	@Override
	public Boolean getAdmin() {
		if (!messaggioVisualizzato)
		{
			System.out.println("Questa versione non è protetta dunque non permette un accesso admin");
			messaggioVisualizzato = true;
		}
		
		return false;
	}

	@Override
	public Image getUserImg() {
		return userImg;
	}

	@Override
	public Image getAdminImg() {
		return adminImg;
	}

}
