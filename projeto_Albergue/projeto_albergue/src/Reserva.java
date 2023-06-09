import java.sql.*;
import java.util.Date;

public class Reserva {
    int id;
    int idCliente;
    int idQuarto;
    int idCama;
    Date dataEntrada;
    Date dataSaida;

// construtor
    public Reserva(int id, int idCliente, int idQuarto, int idCama, Date dataEntrada, Date dataSaida) {
        this.id = id;
        this.idCliente = idCliente;
        this.idQuarto = idQuarto;
        this.idCama = idCama;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

// getters
    public int getId() {return id;}
    public int getIdCliente() {return idCliente;}
    public int getIdQuarto() {return idQuarto;}
    public int getIdCama() {return idCama;}
    public Date getDataEntrada() {return dataEntrada;}
    public Date getDataSaida() {return dataSaida;}

 // setters
    public void setId(int id) {this.id = id;}
    public void setIdCliente(int idCliente) {this.idCliente = idCliente;}
    public void setIdQuarto(int idQuarto) {this.idQuarto = idQuarto;}
    public void setIdCama(int idCama) {this.idCama = idCama;}
    public void setDataEntrada(Date dataEntrada) {this.dataEntrada = dataEntrada;}
    public void setDataSaida(Date dataSaida) {this.dataSaida = dataSaida;}

//métodos para DB
    public void inserir(Connection connection) throws SQLException {
        ReservaDB reservaDB = new ReservaDB(connection);
        reservaDB.inserirReserva(this);
    }

    public void deletar(Connection connection) throws SQLException {
        ReservaDB reservaDB = new ReservaDB(connection);
        reservaDB.deletarReserva(this);
    }

    public void atualizar(Connection connection) throws SQLException {
        ReservaDB reservaDB = new ReservaDB(connection);
        reservaDB.atualizarReserva(this);
    }

    public Reserva buscar(Connection connection) throws SQLException {
        ReservaDB reservaDB = new ReservaDB(connection);
        return reservaDB.buscarReserva(this.id);
    }
}