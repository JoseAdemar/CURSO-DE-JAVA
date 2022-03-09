package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
public static void main(String[] args) {
	
	Map<Integer, String> usuarios = new HashMap<>();
	
	// Ao adicionar elementos com put pode adicionar ou alterar o elemento
	// Map não reconhece elementos duplicados
	usuarios.put(1, "Roberto");
	usuarios.put(2, "Ricardo");
	usuarios.put(3, "Rafaela");
	usuarios.put(4, "Rebeca");
	
	System.out.println(usuarios.size());
	System.out.println(usuarios.isEmpty());
	
	// keySet mostra o valor das chaves e não mostra de forma ordenada 
	System.out.println(usuarios.keySet());
	
	// values pega os valores
	System.out.println(usuarios.values());
	
	// entrySet pega as chaves e valores
	System.out.println(usuarios.entrySet());
	
	System.out.println(usuarios.containsKey(4));
	
	System.out.println(usuarios.containsValue("Rebeca"));
	
	System.out.println(usuarios.get(4));
	
	
	// Esse for só pega as chaves
	for(int chave : usuarios.keySet()) {
		System.out.println(chave);
	}
	
	
	// Pega somente os valores
	for(String valor : usuarios.values()) {
		System.out.println(valor);
	}
	
	
	// Pega chave e valor
	for(Entry<Integer, String> registro : usuarios.entrySet()) {
		System.out.println(registro);
	}
	
	
	
}
}
