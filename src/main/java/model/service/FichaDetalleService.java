package model.service;

import model.dao.GenericDAO;
import model.entity.FichaDetalle;
import model.entity.Mision;

public class FichaDetalleService extends GenericServiceImpl<FichaDetalle, Integer>{
    protected FichaDetalleService(GenericDAO<FichaDetalle, Integer> dao) {
        super(dao);
    }
}
