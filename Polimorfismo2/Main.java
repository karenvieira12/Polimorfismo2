
public class Main {
	public static void main(String[] args) {
		// Criando instâncias de Mamifero e Ave
        Mamifero leao = new Mamifero("Leão", "Leão Africano");
        Ave papagaio = new Ave("Papagaio", "Arara");

        // Criando instância do Zoologico
        Zoologico zoo = new Zoologico();

        // Adicionando animais ao zoológico
        zoo.adicionarAnimal(leao);
        zoo.adicionarAnimal(papagaio);

        // Fazendo barulho no zoológico
        zoo.fazerBarulho();
       
    }
}


