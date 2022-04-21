package com.company.Exceptions;

public class WrongAnswerException extends Throwable {
    public WrongAnswerException() {
        super();
    }

    public WrongAnswerException(String m) {
        super(m); //for commit
    }
}
