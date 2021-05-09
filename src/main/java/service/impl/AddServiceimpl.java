package service.impl;

import dao.IAddCar;
import dao.ICarDao;
import dao.impl.IAddCarImpl;
import dao.impl.ICarDaoImpl;
import service.AddService;

public class AddServiceimpl implements AddService {
   IAddCar iAddCar= new IAddCarImpl();
    @Override
    public void addCar(String numbe, String brand, int price) {
        iAddCar.addCar(numbe,brand,price);
    }



}
