package pl.edu.pk.cosmo.habsatbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Document("data_test")
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class FlightData {
    @MongoId
    @Field("_id")
    private String id;

    @NotNull()
    private Double speed;

    @NotNull()
    private Double altitude;

    @NotNull()
    private Double longitude;

    @NotNull()
    private Double latitude;

    @NotNull()
    private Double temperature;

    @NotNull()
    private LocalDateTime time;

    @NotNull()
    private Double rssi;

    private String flightId;
}
