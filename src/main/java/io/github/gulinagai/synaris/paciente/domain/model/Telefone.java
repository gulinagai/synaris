package io.github.gulinagai.synaris.paciente.domain.model;

import java.util.Objects;

public final class Telefone {

    private final String valor;

    public Telefone(String valor) {

        Objects.requireNonNull(valor, "Telefone não pode ser nulo.");

        valor = valor.replaceAll("\\D", "");

        if (valor.isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser vazio.");
        }

        if (valor.length() < 10 || valor.length() > 11) {
            throw new IllegalArgumentException("Telefone deve conter 10 ou 11 dígitos.");
        }

        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone telefone)) return false;
        return Objects.equals(valor, telefone.valor);
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
