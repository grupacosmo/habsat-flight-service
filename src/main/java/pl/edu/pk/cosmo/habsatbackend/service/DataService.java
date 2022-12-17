package pl.edu.pk.cosmo.habsatbackend.service;

import pl.edu.pk.cosmo.habsatbackend.entity.FlightData;
import pl.edu.pk.cosmo.habsatbackend.exception.NoDataException;

import java.util.List;

public interface DataService {
    void save(final FlightData flightData);
    void sendFrame(final FlightData flightData);
    List<FlightData> findAll();
    void deleteAll();
    void saveAll(List<FlightData> list);
    void changeData(FlightData newFlightData, String id) throws NoDataException;
    FlightData findById(String id) throws NoDataException;
    void deleteById(String id) throws NoDataException;
    void deleteTestData();
}
