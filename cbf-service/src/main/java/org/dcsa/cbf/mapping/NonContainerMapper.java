package org.dcsa.cbf.mapping;

import org.dcsa.cbf.persistence.entity.NonContainer;
import org.dcsa.cbf.transferobjects.NonContainerTO;
import org.mapstruct.Mapper;

@Mapper(
  componentModel = "spring",
  uses = {DischargeMapper.class}
)
public interface NonContainerMapper {

  NonContainer toEntity(NonContainerTO nonContainer);

  NonContainerTO toTO(NonContainer nonContainerEntity);
}
