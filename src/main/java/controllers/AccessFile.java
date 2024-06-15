package controllers;

import java.io.IOException;
import java.io.RandomAccessFile;
import models.Cliente;

public class AccessFile 
{
    private RandomAccessFile flujo;
    private int numRegistros;
    private final int tamRegistro = 172;  // Assuming fixed length for string fields
    
    public void abrirFile(String archi) throws IOException
    {
        flujo = new RandomAccessFile(archi, "rw");
        numRegistros = (int)Math.ceil((double)flujo.length() / tamRegistro);
    }   
    
    public void cerrarFile() throws IOException
    {
        flujo.close();
    }
    
    public int getNumRegistros()
    {
        return numRegistros;
    }
    
    public void agregarClientes(Cliente cli) throws IOException
    {
        flujo.seek(numRegistros * tamRegistro);
        flujo.writeInt(cli.getDni());
        flujo.writeUTF(String.format("%-30s", cli.getNombre())); // Assuming max 30 chars
        flujo.writeUTF(String.format("%-30s", cli.getApellidos())); // Assuming max 30 chars
        flujo.writeUTF(String.format("%-50s", cli.getDireccion())); // Assuming max 50 chars
        flujo.writeUTF(String.format("%-20s", cli.getTelefono())); // Assuming max 20 chars
        flujo.writeUTF(String.format("%-50s", cli.getCorreo())); // Assuming max 50 chars
        numRegistros++;
    }

    public Cliente obtenerUnCliente(int i) throws IOException
    {
        flujo.seek(i * tamRegistro);
        return new Cliente(flujo.readInt(), 
                            flujo.readUTF().trim(),
                            flujo.readUTF().trim(),
                            flujo.readUTF().trim(),
                            flujo.readUTF().trim(),
                            flujo.readUTF().trim());
    }
    
    public Cliente buscarClientes(int dni) throws IOException
    {
        Cliente c = null;
        for (int i = 0; i < getNumRegistros(); ++i)
        {
            flujo.seek(i * tamRegistro);
            c = obtenerUnCliente(i);
            int dniCliente = c.getDni();
            if (dniCliente == dni)
                return c;
        }
        return null;
    }
    
    public String getClientes() throws IOException
    {
        StringBuilder datCli = new StringBuilder();
        for (int i = 0; i < getNumRegistros(); ++i)
        {
            flujo.seek(i * tamRegistro);
            Cliente c = obtenerUnCliente(i);
            datCli.append(c.getDni()).append("\t")
                  .append(c.getNombre()).append("\t\t")
                  .append(c.getApellidos()).append("\t\t")
                  .append(c.getDireccion()).append("\t\t")
                  .append(c.getTelefono()).append("\t\t")
                  .append(c.getCorreo()).append("\n");
        }
        return datCli.toString();
    }
}
