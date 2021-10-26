package com.socket.saul;

import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} 

    public void startClient() 
    {
        try
        {
            
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            
            
            salidaServidor.writeUTF("Hola mundo\n");
            
            cs.close();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}