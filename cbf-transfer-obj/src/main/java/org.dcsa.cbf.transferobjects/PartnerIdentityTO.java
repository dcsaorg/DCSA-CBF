package org.dcsa.cbf.transferobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PartnerIdentityTO {
  private String code;
  private String codeListProvider;
  private String agreementTypeCode;
}
