package org.dcsa.cbf.service;


import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.dcsa.cbf.persistence.repository.ConsolidatedBookingForecastRepository;
import org.dcsa.cbf.transferobjects.ConsolidatedBookingForecast;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsolidatedBookingForecastService {

  private final ConsolidatedBookingForecastRepository cbfRepository;

  public ConsolidatedBookingForecast getConsolidatedBookingForecast(String carrierServiceCode, String universalServiceReference,
                                                                    String vesselIMONumber) {

    if ((StringUtils.isNotEmpty(carrierServiceCode)||StringUtils.isNotEmpty(carrierServiceCode))&&StringUtils.isNotEmpty(vesselIMONumber)){
      cbfRepository.findByFilters(vesselIMONumber,carrierServiceCode,universalServiceReference);
    }

      return null;
  }

  public ConsolidatedBookingForecast submitConsolidatedBookingForecast(ConsolidatedBookingForecast consolidatedBookingForecast){
    return null;
  }
}
