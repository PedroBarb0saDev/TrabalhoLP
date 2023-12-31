package Bean;
// Generated 14/09/2023 08:42:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UsuarioPhsb generated by hbm2java
 */
@Entity
@Table(name="usuario_phsb"
    ,catalog="db_pedro_barbosa"
)
public class UsuarioPhsb  implements java.io.Serializable {


     private int idUsuarioPhsb;
     private String nomePhsb;
     private String apelidoPhsb;
     private String cpfPhsb;
     private String sexoPhsb;
     private String emailPhsb;
     private String cidadePhsb;
     private String estadoPhsb;
     private String cepPhsb;

    public UsuarioPhsb() {
    }

    public UsuarioPhsb(int idUsuarioPhsb, String nomePhsb, String apelidoPhsb, String cpfPhsb, String sexoPhsb, String emailPhsb, String cidadePhsb, String estadoPhsb, String cepPhsb) {
       this.idUsuarioPhsb = idUsuarioPhsb;
       this.nomePhsb = nomePhsb;
       this.apelidoPhsb = apelidoPhsb;
       this.cpfPhsb = cpfPhsb;
       this.sexoPhsb = sexoPhsb;
       this.emailPhsb = emailPhsb;
       this.cidadePhsb = cidadePhsb;
       this.estadoPhsb = estadoPhsb;
       this.cepPhsb = cepPhsb;
    }
   
     @Id 

    
    @Column(name="id_usuario_phsb", unique=true, nullable=false)
    public int getIdUsuarioPhsb() {
        return this.idUsuarioPhsb;
    }
    
    public void setIdUsuarioPhsb(int idUsuarioPhsb) {
        this.idUsuarioPhsb = idUsuarioPhsb;
    }

    
    @Column(name="nome_phsb", nullable=false, length=20)
    public String getNomePhsb() {
        return this.nomePhsb;
    }
    
    public void setNomePhsb(String nomePhsb) {
        this.nomePhsb = nomePhsb;
    }

    
    @Column(name="apelido_phsb", nullable=false, length=20)
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

    
    @Column(name="sexo_phsb", nullable=false, length=1)
    public String getSexoPhsb() {
        return this.sexoPhsb;
    }
    
    public void setSexoPhsb(String sexoPhsb) {
        this.sexoPhsb = sexoPhsb;
    }

    
    @Column(name="email_phsb", nullable=false, length=45)
    public String getEmailPhsb() {
        return this.emailPhsb;
    }
    
    public void setEmailPhsb(String emailPhsb) {
        this.emailPhsb = emailPhsb;
    }

    
    @Column(name="cidade_phsb", nullable=false, length=20)
    public String getCidadePhsb() {
        return this.cidadePhsb;
    }
    
    public void setCidadePhsb(String cidadePhsb) {
        this.cidadePhsb = cidadePhsb;
    }

    
    @Column(name="estado_phsb", nullable=false, length=20)
    public String getEstadoPhsb() {
        return this.estadoPhsb;
    }
    
    public void setEstadoPhsb(String estadoPhsb) {
        this.estadoPhsb = estadoPhsb;
    }

    
    @Column(name="cep_phsb", nullable=false, length=15)
    public String getCepPhsb() {
        return this.cepPhsb;
    }
    
    public void setCepPhsb(String cepPhsb) {
        this.cepPhsb = cepPhsb;
    }




}


