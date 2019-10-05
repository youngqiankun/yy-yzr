package com.yytec.dogmell.models;

import lombok.Data;

/**
 * @author yangyang
 * @date 10/5/19 10:03
 */
@Data
public class Message {
    private String from;
    private String to;
    private String content;
}
