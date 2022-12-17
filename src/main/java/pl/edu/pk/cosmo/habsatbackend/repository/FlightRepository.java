package pl.edu.pk.cosmo.habsatbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import pl.edu.pk.cosmo.habsatbackend.entity.Flight;
import pl.edu.pk.cosmo.habsatbackend.entity.assets.FlightStage;
import pl.edu.pk.cosmo.habsatbackend.entity.response.FlightResponse;

import java.util.Date;
import java.util.Optional;

@Repository
public interface FlightRepository extends MongoRepository<Flight, String> {

    boolean existsByDate(Date date);
    Optional<Flight> findFlightByDate(Date date);

    @Query("{'flightStage': $0}")
    Optional<Flight> findFlightByFlightStage(FlightStage flightStage);

    @Query("{'flightStage': 2}")
    Optional<Flight> findMostRecentFlight();
}
