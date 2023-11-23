package org.dcsa.cbf.transferobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ForecastTO {
  private String portVisitReference;
  private String transportCallReference;
  private String carrierImportVoyageNumber;
  private String carrierExportVoyageNumber;
  private String universalImportVoyageReference;
  private String universalExportVoyageReference;
  private Location location;
  private List<ContainerLoadTO> loadLadenContainers;
  private List<ContainerLoadTO> loadEmptyContainers;
  private List<NonContainerTO> loadBreakBulk;
  private List<NonContainerTO> loadOutOfGauge;

}
