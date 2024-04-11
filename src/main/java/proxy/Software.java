package proxy;

import java.util.Arrays;
import java.util.List;

public class Software implements ISoftware {

        private String nome;

        private Integer qtdLiencas;

        private Integer versao;

        public Software(int versao, String nome, int qtdLiencas) {
            this.versao = versao;
            this.nome = nome;
            this.qtdLiencas = qtdLiencas;
        }

        public Integer getVersao() {
            return versao;
        }

        @Override
        public List<String> obterAcesso() {
            return Arrays.asList(this.nome);
        }



}
