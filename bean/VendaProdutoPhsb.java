package bean;
// Generated 01/12/2023 10:35:20 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VendaProdutoPhsb generated by hbm2java
 */
@Entity
@Table(name = "venda_produto_phsb",
         catalog = "db_pedro_barbosa"
)
public class VendaProdutoPhsb implements java.io.Serializable {

    private int idvendaProdutoPhsb;
    private ProdutoPhsb produtoPhsb;
    private VendaPhsb vendaPhsb;
    private double valorUnitarioPhsb;
    private int quantidadePhsb;

    public VendaProdutoPhsb() {
    }

    public VendaProdutoPhsb(int idvendaProdutoPhsb, ProdutoPhsb produtoPhsb, VendaPhsb vendaPhsb, double valorUnitarioPhsb, int quantidadePhsb) {
        this.idvendaProdutoPhsb = idvendaProdutoPhsb;
        this.produtoPhsb = produtoPhsb;
        this.vendaPhsb = vendaPhsb;
        this.valorUnitarioPhsb = valorUnitarioPhsb;
        this.quantidadePhsb = quantidadePhsb;
    }

    @Id

    @Column(name = "idvenda_produto_phsb", unique = true, nullable = false)
    public int getIdvendaProdutoPhsb() {
        return this.idvendaProdutoPhsb;
    }

    public void setIdvendaProdutoPhsb(int idvendaProdutoPhsb) {
        this.idvendaProdutoPhsb = idvendaProdutoPhsb;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_produto_phsb", nullable = false)
    public ProdutoPhsb getProdutoPhsb() {
        return this.produtoPhsb;
    }

    public void setProdutoPhsb(ProdutoPhsb produtoPhsb) {
        this.produtoPhsb = produtoPhsb;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_venda_phsb", nullable = false)
    public VendaPhsb getVendaPhsb() {
        return this.vendaPhsb;
    }

    public void setVendaPhsb(VendaPhsb vendaPhsb) {
        this.vendaPhsb = vendaPhsb;
    }

    @Column(name = "valor_unitario_phsb", nullable = false, precision = 10)
    public double getValorUnitarioPhsb() {
        return this.valorUnitarioPhsb;
    }

    public void setValorUnitarioPhsb(double valorUnitarioPhsb) {
        this.valorUnitarioPhsb = valorUnitarioPhsb;
    }

    @Column(name = "quantidade_phsb", nullable = false)
    public int getQuantidadePhsb() {
        return this.quantidadePhsb;
    }

    public void setQuantidadePhsb(int quantidadePhsb) {
        this.quantidadePhsb = quantidadePhsb;
    }

   

}
