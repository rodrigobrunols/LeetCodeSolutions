package org.lab.solutions.stacksequeues;

import java.time.LocalDateTime;

public abstract class Animal{

    protected LocalDateTime arriveTime;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    private Kind kind;



    public LocalDateTime getArriveTime() {
        return arriveTime;
    }

    public enum Kind {
        DOG,CAT
    }
}
