package org.dcsa.cbf.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "non_container")
public class NonContainer {

  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name ="total_gross_weight")
  private float totalGrossWeight;

  @Column(name ="total_gross_weight_unit")
  private String totalGrossWeightUnit;

  @Column(name = "quantity_teu")
  private float quantityTEU;

  @ManyToOne
  @JoinColumn(name ="forecast_id")
  private Forecast forecast;

  @OneToMany(mappedBy = "discharge")
  private List<Discharge> discharge;
}
