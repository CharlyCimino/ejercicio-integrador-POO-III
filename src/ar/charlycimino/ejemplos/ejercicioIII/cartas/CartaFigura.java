package ar.charlycimino.ejemplos.ejercicioIII.cartas;

import ar.charlycimino.ejemplos.ejercicioIII.Palo;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class CartaFigura extends CartaConPalo {

    private char letra;

    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }

}
