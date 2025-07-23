package br.com.timbodev.CadastroDeNinjas.missoes;

import br.com.timbodev.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Rank dificuldade;

    //uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

}
