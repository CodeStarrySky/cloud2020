package com.wch.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {

    private Long id;

    private Integer total;

    private Integer used;

    private Integer  residue;



}