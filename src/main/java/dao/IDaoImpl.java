package dao;

public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version Base de donnee");
        double t=23;
        return t;

    }
}
