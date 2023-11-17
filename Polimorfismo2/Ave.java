
public class Ave extends Animal {
    private String tipoAve;

    public Ave(String nome, String tipoAve) {
        super(nome);
        this.tipoAve = tipoAve;
    }

    public String getTipoAve() {
		return tipoAve;
	}

	public void setTipoAve(String tipoAve) {
		this.tipoAve = tipoAve;
	}

    public void emitirSom() {
		super.emitirSom();
        System.out.println("A ave " + tipoAve + " emite um som específico.");
    }

	@Override
	public String toString() {
		return "Ave [tipoAve=" + tipoAve + "]";
	}
    
}
