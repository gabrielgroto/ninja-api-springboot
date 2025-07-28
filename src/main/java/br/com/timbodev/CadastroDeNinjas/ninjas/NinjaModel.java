package br.com.timbodev.CadastroDeNinjas.ninjas;

import br.com.timbodev.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

@Entity
@Table(name = "tb_ninja")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;

    //um ninja so pode ter uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missao;
}
