package vitorpds.github.com.studywork.dto;

import org.hibernate.validator.constraints.br.CPF;
import vitorpds.github.com.studywork.entities.Status;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.Instant;

public class ClientDTO implements Serializable {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String address;
    @CPF
    @NotBlank
    private String cpfCnpj;
    private Instant dateBirth;
    private Long duaDate;
    private Status status;

    public ClientDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Instant getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Instant dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Long getDuaDate() {
        return duaDate;
    }

    public void setDuaDate(Long duaDate) {
        this.duaDate = duaDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
