package org.dcsa.cbf.controller;

import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import org.dcsa.cbf.transferobjects.ConsolidatedBookingForecast;
import org.dcsa.cbf.service.ConsolidatedBookingForecastService;
import org.dcsa.skernel.infrastructure.validation.ValidVesselIMONumber;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("${spring.application.context-path}")
public class ConsolidatedBookingForecastController {


  private final ConsolidatedBookingForecastService cbfService;

  @GetMapping(path = "/v1/booking-forecasts")
  public ConsolidatedBookingForecast getBookingForecasts(
    @Size(max = 11) @RequestParam(required = false) String carrierServiceCode,
    @Size(max = 8) @RequestParam(required = false) String universalServiceReference,
    @ValidVesselIMONumber(allowNull = true) @RequestParam(required = false) String vesselIMONumber,@RequestBody ConsolidatedBookingForecast consolidatedBookingForecast){

    return cbfService.getConsolidatedBookingForecast(carrierServiceCode,universalServiceReference,vesselIMONumber);
  }

  @PostMapping(path = "/v1/booking-forecasts")
  public ConsolidatedBookingForecast submitBookingForecast(@RequestBody ConsolidatedBookingForecast consolidatedBookingForecast){
    return cbfService.submitConsolidatedBookingForecast(consolidatedBookingForecast);
  }
}
