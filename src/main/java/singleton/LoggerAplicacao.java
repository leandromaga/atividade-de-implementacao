package singleton;

import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoggerAplicacao {

    private static LoggerAplicacao instance;

    public static LoggerAplicacao getInstance() {
        if(instance == null) {
            instance = new LoggerAplicacao();
        }
        return instance;
    }

    private String id;

    private Date hora;

    private String descricao;

    private LoggerAplicacao() {
        this.id = "1";
        this.hora = new Date();
        this.descricao = "Log de aplicação";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void salvarLogNoSistema(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            writer.write(this.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object loggerDestroyer() {
        if(instance != null) {
            instance = null;
            System.out.println("Logger destruído");
        }
        System.out.println("Logger não existe");
        return instance;
    }

    @Override
    public String toString() {
        return "LoggerAplicacao{" + "id=" + id + ", hora=" + hora + ", descricao=" + descricao + '}';
    }




}
