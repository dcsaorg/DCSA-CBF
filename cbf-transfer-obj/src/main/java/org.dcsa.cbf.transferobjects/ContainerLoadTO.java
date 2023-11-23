package org.dcsa.cbf.transferobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ContainerLoadTO {
  private String equipmentSizeCode;
  private String averageTotalContainerWeight;
  private String averageTotalContainerWeightUnit;
  private Units unitsNonDG;
  private Units unitsDG;
  private Units units;
  List<DischargeTO> discharge;

}
