package Objects;

import java.util.Date;

public abstract class Transaccion implements ITransaccion {
    protected int idTransaccion;
    protected Date fecha;
    protected double monto;

    @Override
    public int getIdTransaccion() {
        return idTransaccion;
    }

    @Override
    public Date getFecha() {
        return fecha;
    }

    @Override
    public double getMonto() {
        return monto;
    }
}
