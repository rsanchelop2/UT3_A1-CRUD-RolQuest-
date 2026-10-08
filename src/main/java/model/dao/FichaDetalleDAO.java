package model.dao;

import model.entity.FichaDetalle;
import model.entity.Mision;

public class FichaDetalleDAO extends GenericDAOImpl<FichaDetalle, Integer>{
    public FichaDetalleDAO() {
        super(FichaDetalle.class);
    }
}
