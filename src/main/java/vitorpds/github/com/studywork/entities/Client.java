package vitorpds.github.com.studywork.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @Column(length = 14)
    private String cpfCnpj;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dateBirth;
    private Long duaDate;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Client() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(name, client.name) && Objects.equals(address, client.address) && Objects.equals(cpfCnpj, client.cpfCnpj) && Objects.equals(dateBirth, client.dateBirth) && Objects.equals(duaDate, client.duaDate) && status == client.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, cpfCnpj, dateBirth, duaDate, status);
    }
}