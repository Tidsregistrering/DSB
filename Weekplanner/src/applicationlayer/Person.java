package applicationlayer;

public class Person
{
	private boolean leder;
	private String fornavn;
	private String efternavn;
	private String stilling;
	private String brugernavn;
	private String password;
	
	public Person(boolean leder, String fornavn, String efternavn, String stilling, String brugernavn, String password)
	{
		this.leder = leder;
		this.fornavn = fornavn;
		this.efternavn = efternavn;
		this.stilling = stilling;
		this.brugernavn = brugernavn;
		this.password = password; 
	}
	
	public String autoBrugernavn(String fornavn, String efternavn)
	{
		this.brugernavn = brugernavn;
		return this.brugernavn;
		
	}
	
	
}
