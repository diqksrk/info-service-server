package com.codestates.infoserver.model;

import lombok.Data;

@Data
public class ResponseJob {
    private String job;

    public ResponseJob() {
        this.job = "";
    }
}
