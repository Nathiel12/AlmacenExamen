package com.example.examenfinal;

public class Activo {
    private String ID;
    private String Tipo;
    private String Marca;
    private String Modelo;
    private String Serial;
    private String Responsable;

    public Activo(String ID, String Tipo, String Marca, String Modelo, String Serial, String Responsable){
        this.ID = ID;
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Serial = Serial;
        this.Responsable = Responsable;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public String getModelo() {
        return this.Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String Serial) {
        this.Serial = Serial;
    }
    public String getResponsable() {
        return Responsable;
    }
    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }
}
