package ar.charlycimino.ejemplos.ejercicioIII.cartas;

import ar.charlycimino.ejemplos.ejercicioIII.Palo;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public abstract class CartaConPalo extends Carta {

    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

}
