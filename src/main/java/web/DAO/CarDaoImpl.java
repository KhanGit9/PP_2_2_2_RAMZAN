package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{
    List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Mercedes", 222, "A222AA95"));
        carList.add(new Car("Mercedes", 221, "E221EE95"));
        carList.add(new Car("Mercedes", 213, "E213AA95"));
        carList.add(new Car("Ferrari", 599, "F599FF95"));
        carList.add(new Car("BMW", 7, "B777MW95"));
    }
    @Override
    public List<Car> getCarList(int count) {
        return carList.subList(0,count);
    }
}
