package com.ms.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    private String emailForm;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    @Email
    private String subject;
    @NotBlank
    private String text;

}
