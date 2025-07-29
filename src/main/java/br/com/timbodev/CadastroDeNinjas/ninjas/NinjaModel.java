package br.com.timbodev.CadastroDeNinjas.ninjas;

import br.com.timbodev.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_ninja")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "img")
    private String imgUrl;

    //um ninja so pode ter uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missao;
}
