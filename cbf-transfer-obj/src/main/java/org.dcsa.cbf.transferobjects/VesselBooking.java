package org.dcsa.cbf.transferobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class VesselBooking {
  private String vesselOperatorSMDGLinerCode;
  private String vesselIMONumber;
  private String vesselName;
  List<ForecastTO> forecasts;

}
