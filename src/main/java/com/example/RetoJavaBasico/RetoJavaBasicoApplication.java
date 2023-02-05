package com.example.RetoJavaBasico;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.stream.IntStream;

@SpringBootApplication
public class RetoJavaBasicoApplication {

	public static void main(String[] args) {

		Integer[] numerosEnteros = new Integer[10];
		 for (int i = 0; i<10; i++){
			 numerosEnteros[i] = i+1;
		}

		IntStream.range(0, numerosEnteros.length)
				.mapToObj(index -> String.format("indice: %d numero: %s", index, numerosEnteros[index]))
				.forEach(System.out::println);

		Animal[] animales = new Animal[5];
		animales[0] = new Animal("Rana","Rana", "Agua");
		animales[1] = new Animal("Gato","Mamífero", "Habitad humano");
		animales[2] = new Animal("Pez","Pez", "Agua");
		animales[3] = new Animal("Perro","Mamífero", "Habitad humano");
		animales[4] = new Animal("Loro","Ave", "Bosques");

		Arrays.stream(animales).forEach(animal-> System.out.println("Animal: "+animal.getNombre()));
	}
}
