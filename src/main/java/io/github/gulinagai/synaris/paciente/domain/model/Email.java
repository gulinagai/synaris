package io.github.gulinagai.synaris.paciente.domain.model;

import java.util.Objects;
import java.util.regex.Pattern;

public final class Email {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    private final String valor;

    public Email(String valor) {

        Objects.requireNonNull(valor, "E-mail não pode ser nulo.");

        valor = valor.trim().toLowerCase();

        if(valor.isEmpty()) {
            throw new IllegalArgumentException("E-mail não pode ser vazio.");
        }

        if(!EMAIL_PATTERN.matcher(valor).matches()) {
            throw new IllegalArgumentException("E-mail inválido.");
        }

        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email email)) return false;
        return Objects.equals(valor, email.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public String toString() {
        return valor;
    }

}
