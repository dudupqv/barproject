package persistence;

import java.nio.file.Paths;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Cliente;

public class Escritor {

    private static final String PATH = System.getProperty("user.home") + File.separator + "historicoClientes" + File.separator;

    public static void escreve(String fileName, List<Cliente> clientes) {
        File pasta = new File(PATH);

        if(!pasta.exists()) pasta.mkdirs();

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            File arquivo = new File(PATH + fileName + ".txt");

            fw = new FileWriter(arquivo);
            bw = new BufferedWriter(fw);

            for(Cliente cliente : clientes) {
                bw.write(cliente.toString());
                bw.newLine(); bw.newLine();
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

}
