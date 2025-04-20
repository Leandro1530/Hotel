package Objects;

import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String email;
    private int telefono;

    private List<Persona> personasRepresentadas; // relación con Persona
    private List<Reserva> reservas;              // relación con Reserva
}
