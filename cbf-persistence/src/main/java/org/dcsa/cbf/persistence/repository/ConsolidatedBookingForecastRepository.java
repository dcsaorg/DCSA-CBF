package org.dcsa.cbf.persistence.repository;

import java.util.UUID;
import org.dcsa.cbf.persistence.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsolidatedBookingForecastRepository extends JpaRepository <Service, UUID> {

  @Query("SELECT e FROM YourEntity e " +
    "JOIN e.vesselsBookings vb " +
    "JOIN vb.forecasts f " +
    "JOIN f.vessel v " +
    "JOIN e.carrierService cs " +
    "WHERE v.vesselIMONumber = :vesselIMONumber " +
    "AND cs.carrierServiceCode = :carrierServiceCode " +
    "AND e.universalServiceReference = :universalServiceReference")
  Service findByFilters(
    @Param("vesselIMONumber") String vesselIMONumber,
    @Param("carrierServiceCode") String carrierServiceCode,
    @Param("universalServiceReference") String universalServiceReference
  );
}
