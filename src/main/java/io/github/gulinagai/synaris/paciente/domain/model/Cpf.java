package io.github.gulinagai.synaris.paciente.domain.model;

import java.util.Objects;

public final class Cpf {

    private final String valor;

    public Cpf(String valor) {
        Objects.requireNonNull(valor, "CPF não pode ser nulo.");

        valor = valor.replaceAll("\\D", "");

        if(valor.isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser vazio.");
        }

        if(valor.length() != 11) {
            throw  new IllegalArgumentException("CPF deve conter 11 dígitos.");
        }

        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Cpf cpf)) return false;
        return Objects.equals(valor, cpf.valor);
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
