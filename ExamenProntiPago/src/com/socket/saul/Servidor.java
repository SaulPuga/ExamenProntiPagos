package com.socket.saul;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor extends Conexion 
{
    public Servidor() throws IOException{super("servidor");} 
    
    public void startServer()
    {
        try
        {
            System.out.println("Esperando..."); 

            cs = ss.accept(); 

            System.out.println("Cliente en línea");

            
            salidaCliente = new DataOutputStream(cs.getOutputStream());

          
            salidaCliente.writeUTF("Petición recibida y aceptada");

            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

           
            try {
	            for (String line = entrada.readLine(); line != null; line = entrada.readLine()) {
	                System.out.println(line);
	             }
            } 
            catch(Exception ex) {
            	
            }
            
            entrada.close();
             
            System.out.println("Fin de la conexión");

            ss.close();
        }
        catch (Exception e)
        {
        	e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}