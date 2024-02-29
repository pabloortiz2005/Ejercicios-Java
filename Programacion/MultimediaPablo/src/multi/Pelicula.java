package multi;

public class Pelicula extends multi{
	private String actor;
	private String actriz;
	
	
	public Pelicula() {
		super();
	}
	
	public Pelicula(String titulo,String autor,Formato formato, int duracion,String actorP,String actrizP) {
		super(titulo,autor,formato,duracion);
		if(actorP==null && actrizP==null) {
			throw new IllegalArgumentException("Tiene que tener protagonista");
		}
		this.actor=actorP;
		this.actriz=actrizP;
	}

	public String getActorP() {
		return actor;
	}

	public String getActrizP() {
		return actriz;
	}

	@Override
	public String toString() {
		String s= "Protagonizado por ";
		if (actriz != null) {
			s+= actriz;
			if (actor != null) {
				s+= actor;
			}
		}else {
			assert actor !=null;
			s += actor;
		}
		return super.toString() + "\n" + s;
		
	}

	
	
	
}
