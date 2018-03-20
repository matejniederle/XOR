
public class Karel {

	
	private String cesta;
	private String jmeno;
	private String heslo;
	
	public Karel(String cesta , String jmeno , String heslo) {
		this.cesta = cesta;
		this.jmeno = jmeno;
		this.heslo = heslo;
	}
	
	public String getxored() {
		return null;
	}
	
	public void shifra(){
		this.cesta = getxored();
		this.jmeno = getxored();
		this.heslo = getxored();
	}
	
	public String toString() {
		return cesta+" "+jmeno+" "+heslo;
	}
	
	
	
}
