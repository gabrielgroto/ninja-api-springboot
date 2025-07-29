package br.com.timbodev.CadastroDeNinjas.missoes;

import br.com.timbodev.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class MissoesModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

}
