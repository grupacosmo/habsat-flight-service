package pl.edu.pk.cosmo.habsatbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;
import pl.edu.pk.cosmo.habsatbackend.entity.assets.FlightStage;

import java.util.Date;
import java.util.List;

@Document("flight")
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    @MongoId
    @Field("_id")
    private String flightId;

    private Date date;

    private String description;

    private String title;

    private FlightStage flightStage;

    @DBRef
    private List<FlightData> flightDataList;
}
