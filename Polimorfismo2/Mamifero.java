public class Mamifero extends Animal {
    private String tipoMamifero;

    public Mamifero(String nome, String tipoMamifero) {
        super(nome);
        this.tipoMamifero = tipoMamifero;
    }
    
	public String getTipoMamifero() {
		return tipoMamifero;
	}

	public void setTipoMamifero(String tipoMamifero) {
		this.tipoMamifero = tipoMamifero;
	}

	@Override
    public void emitirSom() {
		super.emitirSom();
        System.out.println("O mamífero " + getTipoMamifero() + " emite um som específico.");
    }

	@Override
	public String toString() {
		return "Mamifero [tipoMamifero=" + tipoMamifero + "]";
	}
	
}
