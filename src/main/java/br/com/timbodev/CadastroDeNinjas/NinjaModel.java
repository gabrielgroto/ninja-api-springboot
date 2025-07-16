package br.com.timbodev.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninja")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public NinjaModel() {
    }

    public NinjaModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
