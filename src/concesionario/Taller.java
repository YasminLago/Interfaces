package concesionario;
//Yasmin
public class Taller implements IConcesionario {
    private byte pezasReparar;
    public float prezoTotal(){
        return pezasReparar*20;
    }
    public void calcularPrezo(){
    }
    public void calcularTempoEstancia(){
    }
    public float calcularImposto(){
        return (10*10);
    }
}

