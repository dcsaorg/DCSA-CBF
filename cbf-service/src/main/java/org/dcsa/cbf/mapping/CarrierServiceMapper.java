package org.dcsa.cbf.mapping;


import org.dcsa.cbf.persistence.entity.Service;
import org.dcsa.cbf.transferobjects.CarrierService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
  componentModel = "spring",
  uses = VesselBookingsMapper.class
)
public interface CarrierServiceMapper {
  @Mapping(target= "vessels", source = "vesselsBookings")
  Service toEntity (CarrierService carrierService);

  @Mapping(target= "vesselsBookings", source = "vessels")
  CarrierService toTO(Service service);

}
