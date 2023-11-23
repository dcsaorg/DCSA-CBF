package org.dcsa.cbf.persistence.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "forecast")
public class Forecast {

  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "port_visit_reference")
  private String portVisitReference;

  @Column(name = "transport_call_reference")
  private String transportCallReference;

  @Column(name = "carrier_import_voyage_number")
  private String carrierImportVoyageNumber;

  @Column(name = "carrier_export_voyage_number")
  private String carrierExportVoyageNumber;

  @Column(name = "universal_import_voyage_reference")
  private String universalImportVoyageReference;

  @Column(name = "universal_export_voyage_reference")
  private String universalExportVoyageReference;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "location_id")
  private LocationEntity location;

  @ManyToOne
  @JoinColumn(name = "vessel_id")
  private Vessel vessel;

  @OneToMany(mappedBy = "laden_container_load")
  private List<ContainerLoad> loadLadenContainers;

  @OneToMany(mappedBy = "empty_container_load")
  private List<ContainerLoad> loadEmptyContainers;

  @OneToMany(mappedBy = "break_bulk_load")
  private List<NonContainer> loadBreakBulk;

  @OneToMany(mappedBy = "out_of_gauge_load")
  private List<NonContainer> loadOutOfGauge;
}
