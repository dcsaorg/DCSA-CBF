package org.dcsa.cbf.transferobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class CarrierService {
  private String carrierServiceName;
  private String  carrierServiceCode;
  private String universalServiceReference;
  private List<VesselBooking> vesselsBookings;
}
