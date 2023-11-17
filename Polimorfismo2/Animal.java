public class  Animal {
	    private String nome;
	    
	    public Animal (String nome, String tipoMamifero, String tipoAve) {
	    	this.nome = nome;
	    }

	    public Animal(String nome) {
	        this.nome = nome;
	    }

	    public void emitirSom() {
	        System.out.println("O animal emite um som genérico.");
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "Animal [nome=" + nome + "]";
		}
		
}



