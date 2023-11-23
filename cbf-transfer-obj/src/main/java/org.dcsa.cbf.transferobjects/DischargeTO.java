package org.dcsa.cbf.transferobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class DischargeTO {
  private String portVisitReference;
  private String transportCallReference;
  private Location location;
  private String equipmentSizeCode;
  private String averageGrossWeight;
  private String averageGrossWeightUnit;
  private Units unitsNonDG;
  private Units unitsDG;
  private Units units;
  private String averageTotalContainerWeight;
  private String averageTotalContainerWeightUnit;

  private String totalGrossWeight;
  private String totalGrossWeightUnit;
  private String quantityTEU;

}
