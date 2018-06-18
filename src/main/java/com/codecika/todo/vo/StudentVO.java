package com.codecika.todo.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class StudentVO {
    private String nama;
    private String alamat;
    private String noHp;
    private String kelas;
    private Boolean statusAktif;

}
