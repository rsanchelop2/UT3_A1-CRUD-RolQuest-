package model.entity;

import jakarta.persistence.*;
import model.enums.MisionDificultad;

@Entity
@Table(name = "misiones")
public class Mision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "misionID")
    private Integer misionID;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "dificultad", nullable = false)
    private MisionDificultad dificultad;

    @Column(name = "recompensa", nullable = false)
    private int recompensa;

    @Column(name = "activa", nullable = false)
    private boolean activa;

    @OneToMany
    @JoinColumn(name = "partidaID")
    private Partida partida;

    public Integer getMisionID() {
        return misionID;
    }

    public void setMisionID(Integer misionID) {
        this.misionID = misionID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MisionDificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(MisionDificultad dificultad) {
        this.dificultad = dificultad;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
