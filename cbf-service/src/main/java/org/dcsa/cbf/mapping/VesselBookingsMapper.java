package org.dcsa.cbf.mapping;

import org.dcsa.cbf.persistence.entity.Vessel;
import org.dcsa.cbf.transferobjects.VesselBooking;
import org.mapstruct.Mapper;

@Mapper(
  componentModel = "spring",
  uses = ForecastMapper.class
)
public interface VesselBookingsMapper {

  Vessel toEntity (VesselBooking vesselBooking);

  VesselBooking toTO(Vessel vesselBooking);

}
