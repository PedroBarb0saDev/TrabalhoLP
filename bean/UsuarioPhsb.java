package bean;
// Generated 01/12/2023 10:35:20 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuarioPhsb generated by hbm2java
 */
@Entity
@Table(name="usuario_phsb"
    ,catalog="db_pedro_barbosa"
)
public class UsuarioPhsb  implements java.io.Serializable {


     private int idusuarioPhsb;
     private String nomePhsb;
     private String apelidoPhsb;
     private String cpfPhsb;
     private String senhaPhsb;
     private Date dataNascimentoPhsb;
     private int nivelPhsb;
     private String ativoPhsb;

    public UsuarioPhsb() {
    }

    public UsuarioPhsb(int idusuarioPhsb, String nomePhsb, String apelidoPhsb, String cpfPhsb, String senhaPhsb, Date dataNascimentoPhsb, int nivelPhsb, String ativoPhsb) {
       this.idusuarioPhsb = idusuarioPhsb;
       this.nomePhsb = nomePhsb;
       this.apelidoPhsb = apelidoPhsb;
       this.cpfPhsb = cpfPhsb;
       this.senhaPhsb = senhaPhsb;
       this.dataNascimentoPhsb = dataNascimentoPhsb;
       this.nivelPhsb = nivelPhsb;
       this.ativoPhsb = ativoPhsb;
    }
   
     @Id 

    
    @Column(name="idusuario_phsb", unique=true, nullable=false)
    public int getIdusuarioPhsb() {
        return this.idusuarioPhsb;
    }
    
    public void setIdusuarioPhsb(int idusuarioPhsb) {
        this.idusuarioPhsb = idusuarioPhsb;
    }

    
    @Column(name="nome_phsb", nullable=false, length=30)
    public String getNomePhsb() {
        return this.nomePhsb;
    }
    
    public void setNomePhsb(String nomePhsb) {
        this.nomePhsb = nomePhsb;
    }

    
    @Column(name="apelido_phsb", nullable=false, length=35)
    public String getApelidoPhsb() {
        return this.apelidoPhsb;
    }
    
    public void setApelidoPhsb(String apelidoPhsb) {
        this.apelidoPhsb = apelidoPhsb;
    }

    
    @Column(name="cpf_phsb", nullable=false, length=14)
    public String getCpfPhsb() {
        return this.cpfPhsb;
    }
    
    public void setCpfPhsb(String cpfPhsb) {
        this.cpfPhsb = cpfPhsb;
    }

    
    @Column(name="senha_phsb", nullable=false, length=10)
    public String getSenhaPhsb() {
        return this.senhaPhsb;
    }
    
    public void setSenhaPhsb(String senhaPhsb) {
        this.senhaPhsb = senhaPhsb;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_nascimento_phsb", nullable=false, length=10)
    public Date getDataNascimentoPhsb() {
        return this.dataNascimentoPhsb;
    }
    
    public void setDataNascimentoPhsb(Date dataNascimentoPhsb) {
        this.dataNascimentoPhsb = dataNascimentoPhsb;
    }

    
    @Column(name="nivel_phsb", nullable=false)
    public int getNivelPhsb() {
        return this.nivelPhsb;
    }
    
    public void setNivelPhsb(int nivelPhsb) {
        this.nivelPhsb = nivelPhsb;
    }

    
    @Column(name="ativo_phsb", nullable=false, length=2)
    public String getAtivoPhsb() {
        return this.ativoPhsb;
    }
    
    public void setAtivoPhsb(String ativoPhsb) {
        this.ativoPhsb = ativoPhsb;
    }




}


