package org.dcsa.cbf.mapping;

import org.dcsa.cbf.persistence.entity.PartnerIdentity;
import org.dcsa.cbf.transferobjects.PartnerIdentityTO;
import org.mapstruct.Mapper;

@Mapper(
  componentModel = "spring",
  uses = CarrierServiceMapper.class
)
public interface PartnerIdentityMapper {

  PartnerIdentity toEntity(PartnerIdentityTO partnerIdentityTO);

  PartnerIdentityTO toTO(PartnerIdentity partnerIdentity);
}
