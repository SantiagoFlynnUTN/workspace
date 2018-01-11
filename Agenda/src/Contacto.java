
public abstract class Contacto {

	private String nombre;
	private String apellido;
	private long numero;
	private int myId;
	private static int id=0;
	int a;

	public void setter(int a){
		this.a = a;
	}
	public int getter(){
		return a;
	}
	
	public Contacto(String nombre, long numero) {

		this.nombre = nombre;
		this.numero = numero;
		myId = id++;

	}

	public Contacto(String nombre, String apellido, long numero) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
		myId = id++;
			
	}

	public static int getId(){
		
		return id;
	}
	
	public static void saludo(){
		
		System.out.println("Bienvenido a tu agenda");
	}

	public String getNombreApellido() {

		String nomAp = nombre;

		if (apellido != null) {

			nomAp += " " + apellido;
		}

		return nomAp;

	}

	public long getNumero() {

		return numero;
	}
	
	public String idNomApNum(){
		
		return myId + ") "+ getNombreApellido() + ". Numero: " + numero;
	}
	
	public abstract String dameInfo();
}

class Familiar extends Contacto implements Prioridad, Amistad {

	private String parentezco;
	private int prioridad, amistad;

	public Familiar(String nombre, long numero, String parentezco) {

		super(nombre, numero);

		this.parentezco = parentezco;
	}
	
	public Familiar(String nombre, String apellido, long numero, String parentezco) {

		super(nombre, apellido, numero);

		this.parentezco = parentezco;
	}

	public String getParentezco() {

		return parentezco;
	}
	
	public String dameInfo(){
		
		return idNomApNum() + ". Parentezco: " + parentezco;
	}
	
	public void setPrioridad(int prioridad){
		
		this.prioridad= prioridad;
	}
	
	public int nivelPrioridad(){
		
		return prioridad;
	}
	
	public void setAmistad(int amistad){
		
		this.amistad= amistad;
	}
	
	public int nivelAmistad(){
		
		return amistad;
	}
}

class Trabajo extends Contacto implements Prioridad{
	
	private String puesto;
	private int prioridad;
	
	public Trabajo(String nombre, long numero, String puesto){
		
		super(nombre,numero);
		
		this.puesto = puesto; 
	}
	
	public Trabajo(String nombre, String apellido, long numero, String puesto){
		
		super(nombre, apellido, numero);
		
		this.puesto = puesto;
	}
	
	public String dameInfo(){
		
		return idNomApNum() + ". Puesto: " + puesto;
	}
	
	public void setPrioridad(int prioridad){
		
		this.prioridad= prioridad;
	}
	
	public int nivelPrioridad(){
		
		return prioridad;
	}
}

class Otro extends Contacto implements Amistad{
	
	private String relacion;
	private int amistad;
	
	public Otro(String nombre, long numero, String relacion){
		
		super(nombre, numero);
		
		this.relacion = relacion;
	}
	
	public Otro(String nombre, String apellido, long numero, String relacion){
		
		super(nombre, apellido, numero);
		
		this.relacion = relacion;
	}
	
	public String dameInfo(){
		
		return idNomApNum() + ". Relacion: " + relacion;
	}		
	
	public void setAmistad(int amistad){
		
		this.amistad= amistad;
	}
	
	public int nivelAmistad(){
		
		return amistad;
	}
}