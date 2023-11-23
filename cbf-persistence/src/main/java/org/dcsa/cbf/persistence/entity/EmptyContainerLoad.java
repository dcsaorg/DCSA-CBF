package org.dcsa.cbf.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empty_container_load")
public class EmptyContainerLoad {
  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "equipment_size_code")
  private String equipmentSizeCode;

  @Column(name = "avg_total_container_weight")
  private float avgTotalContainerWeight;

  @Column(name = "avg_total_container_weight_unit")
  private String avgTotalContainerWeightUnit;

  private Units unitsNonDG;

  private Units units_dg;

  @ManyToOne
  @JoinColumn(name ="forecast_id")
  private Forecast forecast;

}
