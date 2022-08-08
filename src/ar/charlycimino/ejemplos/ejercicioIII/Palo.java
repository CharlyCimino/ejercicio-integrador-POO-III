package ar.charlycimino.ejemplos.ejercicioIII;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public enum Palo {
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO),
    PICA(Color.NEGRO),
    TREBOL(Color.NEGRO);

    private Color color;

    private Palo(Color co) {
        this.color = co;
    }
}
