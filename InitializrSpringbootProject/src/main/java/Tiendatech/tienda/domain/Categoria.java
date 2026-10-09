package Tiendatech.tienda.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categoria")        
public class Categoria implements Serializable{

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;
    
    @Column(unique = true, nullable = false, length = 50)
    @NotBlank
    @Size(max = 50)
    private String descripcion;
    
    @Column(length = 1024)
    @Size(max = 1024)
    private String rutaImagen;
    
    @Column(nullable = false)
    private boolean activo = true;
}
