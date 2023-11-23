package org.dcsa.cbf.transferobjects;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class NonContainerTO {
  private String totalGrossWeight;
  private String totalGrossWeightUnit;
  private String quantityTEU;
  List<DischargeTO> discharge;

}
