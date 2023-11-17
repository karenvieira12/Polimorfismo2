
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    // Método para adicionar animal à lista do zoológico
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    // Método para fazer barulho, chamando o método emitirSom() de cada animal na lista
    public void fazerBarulho() {
        for (Animal animal : getAnimais()) {
            animal.emitirSom();
            System.out.println("\n");
        }
    }

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
    
    
}
