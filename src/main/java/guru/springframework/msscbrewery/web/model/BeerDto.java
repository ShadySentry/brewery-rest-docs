package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;

    @NotBlank
    @Size(min = 3,max = 100)
    private String beerName;

    @NotBlank
    private String beerStyle;

    @Positive
    @NotNull
    private Long upc;

    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime lastUpdatedDate;
}
