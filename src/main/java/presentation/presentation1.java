package presentation;
import dao.IDaoImpl;
import metier.IMetierImpl;
public class presentation1 {
    public static void main(String[]args){
        IDaoImpl d = new IDaoImpl();
        IMetierImpl metier= new IMetierImpl(d);
        System.out.println("RES="+metier.calcul());
    }
}
