package br.com.timbodev.CadastroDeNinjas.ninjas;

import br.com.timbodev.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninja")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    //um ninja so pode ter uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missao;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }
}
