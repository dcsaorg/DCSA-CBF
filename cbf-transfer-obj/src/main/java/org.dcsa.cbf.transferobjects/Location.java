package org.dcsa.cbf.transferobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Location {
  private String locationName;
  private String locationType;
  private String UNLocationCode;
  private String facilitySMDGCode;
}
