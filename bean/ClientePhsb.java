package bean;
// Generated 19/10/2023 14:35:35 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClientePhsb generated by hbm2java
 */
@Entity
@Table(name="Cliente_PHSB"
    ,catalog="db_pedro_barbosa"
)
public class ClientePhsb  implements java.io.Serializable {


     private int idClientePhsb;
     private String cpfPhs;
     private String apelidoPhsb;
     private String nomePhsb;
     private Date dataNascimentoPhsb;
     private String telefonePhsb;
     private String sexoPhsb;
     private String rgPhsb;
     private String emailPhsb;
     private String cidadePhsb;
     private String estadoPhsb;
     private String cepPhsb;
     private Date dataCadastroPhsb;
     private String ultimaCompraPhsb;
     private Date dataemissaorgPhsb;
     private String enderecoPhsb;
   

    public ClientePhsb() {
    }

	
    public ClientePhsb(int idClientePhsb, String cpfPhs, String apelidoPhsb, String nomePhsb, Date dataNascimentoPhsb, String telefonePhsb, String sexoPhsb, String rgPhsb, String emailPhsb, String cidadePhsb, String estadoPhsb, String cepPhsb, Date dataCadastroPhsb, String ultimaCompraPhsb, Date dataemissaorgPhsb, String enderecoPhsb) {
        this.idClientePhsb = idClientePhsb;
        this.cpfPhs = cpfPhs;
        this.apelidoPhsb = apelidoPhsb;
        this.nomePhsb = nomePhsb;
        this.dataNascimentoPhsb = dataNascimentoPhsb;
        this.telefonePhsb = telefonePhsb;
        this.sexoPhsb = sexoPhsb;
        this.rgPhsb = rgPhsb;
        this.emailPhsb = emailPhsb;
        this.cidadePhsb = cidadePhsb;
        this.estadoPhsb = estadoPhsb;
        this.cepPhsb = cepPhsb;
        this.dataCadastroPhsb = dataCadastroPhsb;
        this.ultimaCompraPhsb = ultimaCompraPhsb;
        this.dataemissaorgPhsb = dataemissaorgPhsb;
        this.enderecoPhsb = enderecoPhsb;
    }
    public ClientePhsb(int idClientePhsb, String cpfPhs, String apelidoPhsb, String nomePhsb, Date dataNascimentoPhsb, String telefonePhsb, String sexoPhsb, String rgPhsb, String emailPhsb, String cidadePhsb, String estadoPhsb, String cepPhsb, Date dataCadastroPhsb, String ultimaCompraPhsb, Date dataemissaorgPhsb, String enderecoPhsb, Set vendaPhsbs) {
       this.idClientePhsb = idClientePhsb;
       this.cpfPhs = cpfPhs;
       this.apelidoPhsb = apelidoPhsb;
       this.nomePhsb = nomePhsb;
       this.dataNascimentoPhsb = dataNascimentoPhsb;
       this.telefonePhsb = telefonePhsb;
       this.sexoPhsb = sexoPhsb;
       this.rgPhsb = rgPhsb;
       this.emailPhsb = emailPhsb;
       this.cidadePhsb = cidadePhsb;
       this.estadoPhsb = estadoPhsb;
       this.cepPhsb = cepPhsb;
       this.dataCadastroPhsb = dataCadastroPhsb;
       this.ultimaCompraPhsb = ultimaCompraPhsb;
       this.dataemissaorgPhsb = dataemissaorgPhsb;
       this.enderecoPhsb = enderecoPhsb;
    
    }
   
     @Id 

    
    @Column(name="id_cliente_phsb", unique=true, nullable=false)
    public int getIdClientePhsb() {
        return this.idClientePhsb;
    }
    
    public void setIdClientePhsb(int idClientePhsb) {
        this.idClientePhsb = idClientePhsb;
    }

    
    @Column(name="cpf_PHS", nullable=false, length=14)
    public String getCpfPhs() {
        return this.cpfPhs;
    }
    
    public void setCpfPhs(String cpfPhs) {
        this.cpfPhs = cpfPhs;
    }

    
    @Column(name="apelido_PHSB", nullable=false, length=20)
    public String getApelidoPhsb() {
        return this.apelidoPhsb;
    }
    
    public void setApelidoPhsb(String apelidoPhsb) {
        this.apelidoPhsb = apelidoPhsb;
    }

    
    @Column(name="nome_PHSB", nullable=false, length=45)
    public String getNomePhsb() {
        return this.nomePhsb;
    }
    
    public void setNomePhsb(String nomePhsb) {
        this.nomePhsb = nomePhsb;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_nascimento_PHSB", nullable=false, length=10)
    public Date getDataNascimentoPhsb() {
        return this.dataNascimentoPhsb;
    }
    
    public void setDataNascimentoPhsb(Date dataNascimentoPhsb) {
        this.dataNascimentoPhsb = dataNascimentoPhsb;
    }

    
    @Column(name="telefone_PHSB", nullable=false, length=14)
    public String getTelefonePhsb() {
        return this.telefonePhsb;
    }
    
    public void setTelefonePhsb(String telefonePhsb) {
        this.telefonePhsb = telefonePhsb;
    }

    
    @Column(name="sexo_PHSB", nullable=false, length=12)
    public String getSexoPhsb() {
        return this.sexoPhsb;
    }
    
    public void setSexoPhsb(String sexoPhsb) {
        this.sexoPhsb = sexoPhsb;
    }

    
    @Column(name="rg_PHSB", nullable=false, length=8)
    public String getRgPhsb() {
        return this.rgPhsb;
    }
    
    public void setRgPhsb(String rgPhsb) {
        this.rgPhsb = rgPhsb;
    }

    
    @Column(name="email_PHSB", nullable=false, length=30)
    public String getEmailPhsb() {
        return this.emailPhsb;
    }
    
    public void setEmailPhsb(String emailPhsb) {
        this.emailPhsb = emailPhsb;
    }

    
    @Column(name="cidade_PHSB", nullable=false, length=45)
    public String getCidadePhsb() {
        return this.cidadePhsb;
    }
    
    public void setCidadePhsb(String cidadePhsb) {
        this.cidadePhsb = cidadePhsb;
    }

    
    @Column(name="estado_PHSB", nullable=false, length=20)
    public String getEstadoPhsb() {
        return this.estadoPhsb;
    }
    
    public void setEstadoPhsb(String estadoPhsb) {
        this.estadoPhsb = estadoPhsb;
    }

    
    @Column(name="cep_PHSB", nullable=false, length=12)
    public String getCepPhsb() {
        return this.cepPhsb;
    }
    
    public void setCepPhsb(String cepPhsb) {
        this.cepPhsb = cepPhsb;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_cadastro_PHSB", nullable=false, length=10)
    public Date getDataCadastroPhsb() {
        return this.dataCadastroPhsb;
    }
    
    public void setDataCadastroPhsb(Date dataCadastroPhsb) {
        this.dataCadastroPhsb = dataCadastroPhsb;
    }

    
    @Column(name="ultima_compra_PHSB", nullable=false, length=45)
    public String getUltimaCompraPhsb() {
        return this.ultimaCompraPhsb;
    }
    
    public void setUltimaCompraPhsb(String ultimaCompraPhsb) {
        this.ultimaCompraPhsb = ultimaCompraPhsb;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataemissaorg_PHSB", nullable=false, length=10)
    public Date getDataemissaorgPhsb() {
        return this.dataemissaorgPhsb;
    }
    
    public void setDataemissaorgPhsb(Date dataemissaorgPhsb) {
        this.dataemissaorgPhsb = dataemissaorgPhsb;
    }

    
    @Column(name="endereco_PHSB", nullable=false, length=45)
    public String getEnderecoPhsb() {
        return this.enderecoPhsb;
    }
    
    public void setEnderecoPhsb(String enderecoPhsb) {
        this.enderecoPhsb = enderecoPhsb;
    }


     @Override
     public  String toString(){
         return getNomePhsb();
    
}


}


