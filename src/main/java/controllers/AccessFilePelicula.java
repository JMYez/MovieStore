
package controllers;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import models.Pelicula;
import models.Pelicula;

public class AccessFilePelicula {
     RandomAccessFile flujo;
    int numRegistros;
    int tamRegistro = 72;  // Tamaño de cada registro en bytes

    public void abrirFile(String archi) throws IOException {
        flujo = new RandomAccessFile(archi, "rw");
        numRegistros = (int)Math.ceil((double)flujo.length() / (double)tamRegistro);
    }

    public void cerrarFile() throws IOException {
        flujo.close();
    }

    public int getNumRegistros() {
        return numRegistros;
    }

    public void agregarPelicula(Pelicula pel) throws IOException {
        flujo.seek(numRegistros * tamRegistro);
        flujo.writeUTF(pel.getCodigo());
        flujo.writeUTF(pel.getTitulo());
        flujo.writeUTF(pel.getGenero());
        flujo.writeUTF(pel.getSinopsis());
        flujo.writeUTF(pel.getFechaEstreno().toString());
        flujo.writeUTF(pel.getFechaAgregacion().toString());
        flujo.writeInt(pel.getStock());
        numRegistros++;
    }

    public Pelicula obtenerUnaPelicula(int i) throws IOException {
        flujo.seek(i * tamRegistro);
        return new Pelicula(
            flujo.readUTF(),
            flujo.readUTF(),
            flujo.readUTF(),
            flujo.readUTF(),
            LocalDate.parse(flujo.readUTF()),
            LocalDate.parse(flujo.readUTF()),
            flujo.readInt()
        );
    }

    public Pelicula buscarPelicula(String codi) throws IOException {
        Pelicula pel = null;
        for (int i = 0; i < getNumRegistros(); ++i) {
            flujo.seek(i * tamRegistro);
            pel = obtenerUnaPelicula(i);
            String codigo = pel.getCodigo();
            if (codigo.equals(codi))
                return pel;
        }
        return null;
    }

    public String getPeliculas() throws IOException {
        StringBuilder datPel = new StringBuilder();
        for (int i = 0; i < getNumRegistros(); ++i) {
            flujo.seek(i * tamRegistro);
            Pelicula pel = obtenerUnaPelicula(i);
            datPel.append(pel.getCodigo()).append("\t")
                  .append(pel.getTitulo()).append("\t")
                  .append(pel.getGenero()).append("\t")
                  .append(pel.getSinopsis()).append("\t")
                  .append(pel.getFechaEstreno()).append("\t")
                  .append(pel.getFechaAgregacion()).append("\t")
                  .append(pel.getStock()).append("\n");
        }
        return datPel.toString();
    }
}
