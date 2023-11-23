package org.dcsa.cbf.mapping;

import org.dcsa.cbf.persistence.entity.ContainerLoad;
import org.dcsa.cbf.transferobjects.ContainerLoadTO;
import org.mapstruct.Mapper;

@Mapper(
  componentModel = "spring",
  uses = {DischargeMapper.class}
)
public interface ContainerLoadMapper {

  ContainerLoad toEntity(ContainerLoadTO containerLoad);

  ContainerLoadTO toTO(ContainerLoad containerLoad);
}
