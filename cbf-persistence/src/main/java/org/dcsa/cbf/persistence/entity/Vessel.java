package org.dcsa.cbf.persistence.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;
import lombok.*;
import org.dcsa.skernel.domain.persistence.entity.Carrier;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vessel")
public class Vessel {

  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "vessel_imo_number", length = 7, unique = true)
  private String vesselIMONumber;

  @Column(name = "vessel_name", length = 35)
  private String vesselName;

  @Column(name = "vessel_operator_smdg_liner_code")
  private String vesselOperatorSmdgLinerCode;

  @ToString.Exclude
  @EqualsAndHashCode.Exclude
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "vessel_operator_carrier_id")
  private Carrier vesselOperatorCarrier;

  @OneToMany(mappedBy = "forecast")
  private List<Forecast> forecasts;
}
