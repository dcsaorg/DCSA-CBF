package org.dcsa.cbf.mapping;

import org.dcsa.cbf.persistence.entity.Discharge;
import org.dcsa.cbf.transferobjects.DischargeTO;
import org.mapstruct.Mapper;

@Mapper(
  componentModel = "spring"
)
public interface DischargeMapper {

  Discharge toEntity(DischargeTO discharge);

  DischargeTO toTO(Discharge discharge);
}
