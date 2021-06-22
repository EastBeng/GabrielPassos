package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Save {
    public static void salvar(String file_name, String ext, String info) {

        try {
            String new_file_name =  file_name +  ext;
            // Monta o objeto do arquivo e salva
            FileWriter file = new FileWriter(new_file_name);
            BufferedWriter arq = new BufferedWriter(file);
            arq.write(info);
            arq.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void compactar(String caminhno, String ext, String cabecalho, String palavraCript) {
        try {
            // Monta o path e nome do arquivo de acordo com a quantidade
            String new_file_name = caminhno + ext;
            // Monta o objeto do arquivo e salva
            FileWriter file = new FileWriter(new_file_name);
            BufferedWriter arq = new BufferedWriter(file);
            arq.write(cabecalho);
            arq.write("\n");
            arq.write(palavraCript);
            arq.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    public static void newCompactar(String caminho, String ext, String cabecalho, String palavraCript){
        Path path = Paths.get(caminho);
        byte[] bytes = cabecalho.getBytes(StandardCharsets.UTF_8);
        byte[] bytes1 = palavraCript.getBytes(StandardCharsets.UTF_8);
 
        try {
            Files.write(path, bytes);
            System.out.println("Successfully written data to the file");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String readFileTxt(String caminho){
        String valor = "";
        try {
            valor = new String(Files.readAllBytes(Paths.get(caminho)));
        } catch (Exception e) {
            e.getStackTrace();
        }
        return valor;
    }
    
    public static String[] readFileFGM(String caminho){
        String[] valores = new String[2];
        try {
            String arquivo = new String(Files.readAllBytes(Paths.get(caminho)));
            valores = arquivo.split("\n");
        } catch (Exception e) {
            e.getStackTrace();
        }
        return valores;
    }
}
