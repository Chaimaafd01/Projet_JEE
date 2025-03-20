package metier;
import dao.IDao;
import dao.IDaoImpl;
import metier.IMetierImpl;


public class IMetierImpl implements IMetier {
    private IDao dao;

    public IMetierImpl(IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
            double t =dao.getData();

        return 0;
    }
}
