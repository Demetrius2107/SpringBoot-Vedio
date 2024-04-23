package com.hua.entity.json;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class DetailsJson implements Serializable {
    Double score;
    String question;
    String label;
    String group;
}
