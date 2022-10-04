package Builder;

public class CarroBuilderFluente {

	private Carro carro;
	
	public CarroBuilderFluente() {
		this.carro = new Carro();
	}
	
	public CarroBuilderFluente buildPorta(Porta[] portas) {
		carro.setPortas(portas);
		return this;
	}
	
	public CarroBuilderFluente buildMotor(Motor m) {
		carro.setMotor(m);
		return this;
	}
	
	public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
		return this;
	}
	
	public CarroBuilderFluente buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
		return this;
	}

	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}

	// devolve o carro
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	private void validarPortas() {
		if (carro.getPortas() == null) {
			throw new IllegalStateException("Nenhuma porta foi adicionada");
		}
		
		int numeroPortas = carro.getPortas().length;
		if(numeroPortas != 2 && numeroPortas != 4){
            throw new IllegalStateException("O carro deve ter 2 ou 4 portas");
        }
		
		
	}
	
	
	public void validarMotor(){
        if(carro.getMotor() == null){
            throw new IllegalStateException("Nenhum motor foi adicionado");
        }
    }
	
}
