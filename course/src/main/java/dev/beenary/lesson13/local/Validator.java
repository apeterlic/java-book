package dev.beenary.lesson13.local;

public interface Validator<T> {

    boolean validate(T t);
}
