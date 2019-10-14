package com.yytec.dogmell.models;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangyang
 * @date 10/5/19 10:03
 */
@Data
public class Message implements Serializable {
    private String from;
    private String to;
    private String content;
}
