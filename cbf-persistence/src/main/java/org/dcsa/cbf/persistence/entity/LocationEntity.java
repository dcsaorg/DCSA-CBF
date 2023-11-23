package org.dcsa.cbf.persistence.entity;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "location")
public class LocationEntity {

  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "location_name", length = 100)
  private String locationName;

  @Column(name = "un_location_code", length = 5, columnDefinition = "bpchar")
  private String UNLocationCode;

  @Column(name = "location_type")
  private String locationType;

}
