package com.systelab.kafka.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
@NoArgsConstructor
public class CustomerTypeAction {
    private String action;
    private CustomerType type;
}
