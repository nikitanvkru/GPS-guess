package com.example.gpsgeoproject.controllers;

import com.example.gpsgeoproject.models.GeoIP;
import com.example.gpsgeoproject.services.RawDBGeoIPLocationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class GeoIPController {
    private RawDBGeoIPLocationService locationService;

    public GeoIPController() throws IOException {
        locationService = new RawDBGeoIPLocationService();
    }

    @PostMapping("/geo-ip")
    public GeoIP getLocation(@RequestParam(value = "ipAddress", required = true) String ipAddress) throws Exception {

        RawDBGeoIPLocationService locationService
                = new RawDBGeoIPLocationService();
        System.out.println(locationService.getLocation(ipAddress));
        return locationService.getLocation(ipAddress);
    }
}

