
package parcialprogramacion2;

    abstract class Animal {
    protected String sonidos;
    protected String alimentos;
    protected String hábitat;
    protected String nombreCientífico;

    public abstract String getNombreCientífico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHábitat();
}

class Cánido extends Animal {
    public Cánido(String nombreCientífico, String sonido, String alimentos, String hábitat) {
        this.nombreCientífico = nombreCientífico;
        this.sonidos = sonido;
        this.alimentos = alimentos;
        this.hábitat = hábitat;
    }

    @Override
    public String getNombreCientífico() {
        return nombreCientífico;
    }

    @Override
    public String getSonido() {
        return sonidos;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHábitat() {
        return hábitat;
    }
}

class Felino extends Animal {
    public Felino(String nombreCientífico, String sonido, String alimentos, String hábitat) {
        this.nombreCientífico = nombreCientífico;
        this.sonidos = sonido;
        this.alimentos = alimentos;
        this.hábitat = hábitat;
    }

    @Override
    public String getNombreCientífico() {
        return nombreCientífico;
    }

    @Override
    public String getSonido() {
        return sonidos;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHábitat() {
        return hábitat;
    }
}

public class PruebaAnimales {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Cánido("Canis lupus familiaris", "ladrido", "carnívora", "doméstico");
        animales[1] = new Cánido("Canis lupus", "aullido", "carnívora", "bosque");
        animales[2] = new Felino("Panthera leo", "rugido", "carnívora", "pradera");
        animales[3] = new Felino("Felis silvestris catus", "maullido", "ratones", "doméstico");

        for (Animal animal : animales) {
            System.out.println("Nombre Científico: " + animal.getNombreCientífico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHábitat());
            System.out.println();
        }
    }
}
