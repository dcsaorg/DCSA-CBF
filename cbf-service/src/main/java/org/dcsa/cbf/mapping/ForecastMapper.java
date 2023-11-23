package org.dcsa.cbf.mapping;

import org.dcsa.cbf.persistence.entity.Forecast;
import org.dcsa.cbf.transferobjects.ForecastTO;
import org.mapstruct.Mapper;

@Mapper(
  componentModel = "spring",
  uses = {ContainerLoadMapper.class, NonContainerMapper.class}
)
public interface ForecastMapper {

  Forecast toEntity(ForecastTO forecast);

  ForecastTO toTO(Forecast forecastEntity);
}
