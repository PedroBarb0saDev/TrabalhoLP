package Bean;
// Generated 14/09/2023 08:42:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProdutoPhsb generated by hbm2java
 */
@Entity
@Table(name="produto_phsb"
    ,catalog="db_pedro_barbosa"
)
public class ProdutoPhsb  implements java.io.Serializable {


     private int idProdutoPhsb;
     private int vendedorPhsb;
     private String tipoPhsb;
     private String valorPhsb;
     private String nomePhsb;
   

    public ProdutoPhsb() {
    }

	
    public ProdutoPhsb(int idProdutoPhsb, int vendedorPhsb, String tipoPhsb, String valorPhsb, String nomePhsb) {
        this.idProdutoPhsb = idProdutoPhsb;
        this.vendedorPhsb = vendedorPhsb;
        this.tipoPhsb = tipoPhsb;
        this.valorPhsb = valorPhsb;
        this.nomePhsb = nomePhsb;
    }
    public ProdutoPhsb(int idProdutoPhsb, int vendedorPhsb, String tipoPhsb, String valorPhsb, String nomePhsb, Set vendaProdutoPhsbs) {
       this.idProdutoPhsb = idProdutoPhsb;
       this.vendedorPhsb = vendedorPhsb;
       this.tipoPhsb = tipoPhsb;
       this.valorPhsb = valorPhsb;
       this.nomePhsb = nomePhsb;
      
    }
   
     @Id 

    
    @Column(name="id_produto_phsb", unique=true, nullable=false)
    public int getIdProdutoPhsb() {
        return this.idProdutoPhsb;
    }
    
    public void setIdProdutoPhsb(int idProdutoPhsb) {
        this.idProdutoPhsb = idProdutoPhsb;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_id_vendedor_phsb", nullable=false)
    public int getVendedorPhsb() {
        return this.vendedorPhsb;
    }
    
    public void setVendedorPhsb(int vendedorPhsb) {
        this.vendedorPhsb = vendedorPhsb;
    }

    
    @Column(name="tipo_phsb", nullable=false, length=20)
    public String getTipoPhsb() {
        return this.tipoPhsb;
    }
    
    public void setTipoPhsb(String tipoPhsb) {
        this.tipoPhsb = tipoPhsb;
    }

    
    @Column(name="valor_phsb", nullable=false, length=100)
    public String getValorPhsb() {
        return this.valorPhsb;
    }
    
    public void setValorPhsb(String valorPhsb) {
        this.valorPhsb = valorPhsb;
    }

    
    @Column(name="nome_phsb", nullable=false, length=20)
    public String getNomePhsb() {
        return this.nomePhsb;
    }
    
    public void setNomePhsb(String nomePhsb) {
        this.nomePhsb = nomePhsb;
    }





}


