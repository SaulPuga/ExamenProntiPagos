package com.socket.saul;

import java.io.DataOutputStream;
import java.io.IOException;

public class ClienteRespaldo extends Conexion
{
    public ClienteRespaldo() throws IOException{super("cliente");} 

    public void startClient() 
    {
        try
        {
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            for (int i = 0; i < 2; i++)
            {
                salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");
            }

            cs.close();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}