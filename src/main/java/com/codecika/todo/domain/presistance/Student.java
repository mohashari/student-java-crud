package com.codecika.todo.domain.presistance;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "STUDENT")
@Data
@DynamicUpdate
public class Student implements Serializable {


    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAMA",length = 30,nullable = false)
    private String nama;

    @Column(name = "ALAMAT",length = 60,nullable = false)
    private String alamat;

    @Column(name = "NO_HP",length = 12,nullable = false)
    private String noHp;

    @Column(name = "KELAS",nullable = false)
    private String kelas;

    @Column(name = "STATUS_AKTIF",nullable = false)
    private Boolean statusAktif;

}
