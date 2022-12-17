package pl.edu.pk.cosmo.habsatbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import pl.edu.pk.cosmo.habsatbackend.entity.FlightData;

@Repository
public interface DataRepository extends MongoRepository<FlightData, String> {
    @Query(value="{'flightId': $0}", delete = true)
    void deleteAllByFlightId(String flightId);
}
