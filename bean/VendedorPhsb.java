package bean;
// Generated 19/10/2023 14:35:35 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * VendedorPhsb generated by hbm2java
 */
@Entity
@Table(name = "Vendedor_PHSB",
        catalog = "db_pedro_barbosa"
)
public class VendedorPhsb implements java.io.Serializable {

    private int idVendedorPhsb;
    private String nomePhsb;
    private String cidadePhsb;
    private String cpfPhsb;
    private String rgPhsb;

    public VendedorPhsb() {
    }

    public VendedorPhsb(int idVendedorPhsb) {
        this.idVendedorPhsb = idVendedorPhsb;
    }

    public VendedorPhsb(int idVendedorPhsb, String nomePhsb, String cidadePhsb, String cpfPhsb, String rgPhsb, Set produtoPhsbs, Set vendaPhsbs) {
        this.idVendedorPhsb = idVendedorPhsb;
        this.nomePhsb = nomePhsb;
        this.cidadePhsb = cidadePhsb;
        this.cpfPhsb = cpfPhsb;
        this.rgPhsb = rgPhsb;

    }

    @Id

    @Column(name = "id_vendedor_phsb", unique = true, nullable = false)
    public int getIdVendedorPhsb() {
        return this.idVendedorPhsb;
    }

    public void setIdVendedorPhsb(int idVendedorPhsb) {
        this.idVendedorPhsb = idVendedorPhsb;
    }

    @Column(name = "nome_PHSB", length = 20)
    public String getNomePhsb() {
        return this.nomePhsb;
    }

    public void setNomePhsb(String nomePhsb) {
        this.nomePhsb = nomePhsb;
    }

    @Column(name = "cidade_PHSB", length = 30)
    public String getCidadePhsb() {
        return this.cidadePhsb;
    }

    public void setCidadePhsb(String cidadePhsb) {
        this.cidadePhsb = cidadePhsb;
    }

    @Column(name = "cpf_PHSB", length = 15)
    public String getCpfPhsb() {
        return this.cpfPhsb;
    }

    public void setCpfPhsb(String cpfPhsb) {
        this.cpfPhsb = cpfPhsb;
    }

    @Column(name = "rg_PHSB", length = 10)
    public String getRgPhsb() {
        return this.rgPhsb;
    }

    public void setRgPhsb(String rgPhsb) {
        this.rgPhsb = rgPhsb;
    }

    public String toString() {
        return getNomePhsb();
    }

    public boolean equals(Object object) {
        if (object instanceof VendedorPhsb) {
            VendedorPhsb vendedorPhsb = (VendedorPhsb) object;
            if (this.getIdVendedorPhsb() == vendedorPhsb.getIdVendedorPhsb()) {
                return true;
            }

        }
        return false;
    }

}
