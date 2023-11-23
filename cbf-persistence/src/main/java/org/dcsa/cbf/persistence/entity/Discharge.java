package org.dcsa.cbf.persistence.entity;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "container_discharge")
public class Discharge {

  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "port_visit_reference")
  private String portVisitReference;

  @Column(name = "transport_call_reference")
  private String transportCallReference;

  @Column(name = "equipment_size_code")
  private String equipmentSizeCode;

  @Column(name = "average_gross_weight")
  private float averageGrossWeight;

  @Column(name = "average_gross_weight_unit")
  private String averageGrossWeightUnit;

  @Column(name = "average_total_container_weight")
  private float averageTotalContainerWeight;

  @Column(name = "average_total_container_weight_unit")
  private String averageTotalContainerWeightUnit;

  @Column(name = "units_non_dg_id")
  private Units unitsNonDG;

  @Column(name = "units_dg_id")
  private Units unitsDG;

  @Column(name = "total_gross_weight")
  private float totalGrossWeight;

  @Column(name = "total_gross_weight_unit")
  private String totalGrossWeightUnit;

  @Column(name = "quantity_teu")
  private String quantityTEU;

  @ManyToOne
  @JoinColumn(name ="laden_container_load_id")
  private ContainerLoad ladenContainerLoad;

  @ManyToOne
  @JoinColumn(name ="empty_container_load_id")
  private ContainerLoad emptyContainerLoad;

  @ManyToOne
  @JoinColumn(name ="break_bulk_load_id")
  private NonContainer breakBulkLoad;

  @ManyToOne
  @JoinColumn(name ="out_of_gauge_load_id")
  private NonContainer outOfGaugeLoad;

  @OneToOne
  @JoinColumn(name = "location_id")
  private LocationEntity location;

}
