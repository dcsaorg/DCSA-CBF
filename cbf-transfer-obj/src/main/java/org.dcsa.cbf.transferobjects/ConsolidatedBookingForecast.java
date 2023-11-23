package org.dcsa.cbf.transferobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ConsolidatedBookingForecast {

  private PartnerIdentityTO partnerIdentity;
  private CarrierService service;

}
