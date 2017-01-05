
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hitzu
 */
public class main {
    
    public static void main(String a[])
    {
        String path = "C:\\Users\\Hitzu\\Desktop\\rostros";
        leer(path);
    }
    
    static boolean leer(String directorio)
    {
        System.out.println("Estoy en: " + directorio);
        File f = new File(directorio);
        File[] ficheros = f.listFiles();
        for (File fichero : ficheros) {
            if (fichero.isDirectory()) 
                leer(fichero.getPath());
            else
                System.out.println(fichero.getName());
        }
        return true;
    }
    
}
