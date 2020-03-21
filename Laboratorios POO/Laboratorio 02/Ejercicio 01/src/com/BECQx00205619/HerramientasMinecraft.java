package com.BECQx00205619;

public class HerramientasMinecraft {
    private String tipo;
    private String material;
    private int ataque;
    private int durabilidad;
    private int dps; //damage per second

    public HerramientasMinecraft(String tipo, String material, int ataque, int durabilidad, int dps) {
        this.tipo = tipo;
        this.material = material;
        this.ataque = ataque;
        this.durabilidad = durabilidad;
        this.dps = dps;
    }

    public void MejorarHerramienta() {
        dps += 10;
        durabilidad += 10;
        ataque += 10;
        System.out.println("Tu " + tipo + " ha recibido una mejora de +10 en todas sus caracteristicas!!!");

    }

    //Getter del tipo, el unico getter que se utilizó

    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return "HerramientasMinecraft{" +
                "tipo='" + tipo + '\'' +
                ", material='" + material + '\'' +
                ", ataque=" + ataque +
                ", durabilidad=" + durabilidad +
                ", dps=" + dps +
                '}';
    }

    public void Atacar() {
        System.out.println("Que agresividad!");
        System.out.println("Con tu " + tipo + " de " + material + " estas atacando de una manera brutal!");
        System.out.println("Estadisticas de ataque: ");
        System.out.println("Ataque: " + ataque);
        System.out.println("Durabilidad: " + durabilidad);
        System.out.println("Damage per seccond: " + dps + "\n\n");
    }
    public void mostrardatos(){
        System.out.println("Tipo: "+ tipo);
        System.out.println("Material: "+material);
        System.out.println("Durabilidad: "+ durabilidad);
        System.out.println("Velocidad de Ataque: "+ dps);
        System.out.println("Daño: "+ ataque +"\n");

    }
}

