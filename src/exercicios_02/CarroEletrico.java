package exercicios_02;

public class CarroEletrico extends Carro {

	private Integer nivelBateria;
	private boolean eletrico;
	
	public CarroEletrico(String modelo, Integer velocidade) {
		super(modelo, velocidade);
		// TODO Auto-generated constructor stub
	}
	
	
	 public Integer getNivelBateria() {
		return nivelBateria;
	 }


	 public void setNivelBateria(Integer nivelBateria) {
		this.nivelBateria = nivelBateria;
	 }

	 public boolean isEletrico() {
			return eletrico;
		 }


		 public void setEletrico(boolean eletrico) {
			this.eletrico = eletrico;
		 }
	 
	 @Overrride
	 public void acelerar() {
		 
		 
		 
		 
	 }
	 
	 
	 
	 @Override
	 public void visualizar() {

	     super.visualizar();

	     
	     System.out.printf("**	Modelo é Eletrico?: %s%n ", this.getNivelBateria());
	     System.out.printf("**	Nivel de Bateria?: %f%n ", this.getNivelBateria());

	     System.out.println("*****************************************************\n");

	 }


	 

}
