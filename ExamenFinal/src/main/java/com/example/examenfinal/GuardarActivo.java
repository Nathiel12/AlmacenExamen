package com.example.examenfinal;

import java.io.*;
import java.util.*;

public class GuardarActivo {
    private List<Activo> listaActivo;
    private String archivoTXT;

    public GuardarActivo(String archivoTXT) {
        this.archivoTXT = archivoTXT;
        listaActivo = new ArrayList<>();
    }

    public void agregarActivo(Activo activo) {
        this.listaActivo.add(activo);
        guardarActivos();
        this.generarArchivo(activo);
    }


    private void guardarActivos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.archivoTXT, true))) {
            for (Activo activo : listaActivo) {

                writer.write(activo.getID() + ";" + activo.getTipo() + ";" + activo.getMarca() + ";" + activo.getModelo() + ";" + activo.getSerial() + ";" + activo.getResponsable());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo .txt: " + e.getMessage());
        }
    }

    private void generarArchivo(Activo activo) {
        String archivoActivo="data/Activos.txt";
        File archivo = new File(archivoActivo);
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("Archivo creado: " + archivoActivo);
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }

    }

}
