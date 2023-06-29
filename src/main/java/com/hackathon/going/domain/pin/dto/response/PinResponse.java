package com.hackathon.going.domain.pin.dto.response;

import com.hackathon.going.domain.pin.constant.PinStatus;
import com.hackathon.going.domain.pin.dto.PinDto;
import com.hackathon.going.domain.travel.response.TravelResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class PinResponse {

    private Long id;
    private Double latitude;
    private Double longitude;
    private TravelResponse travel;
    private PinStatus status;

    public static PinResponse fromDto(PinDto dto) {
        return PinResponse.builder()
                .id(dto.getId())
                .latitude(dto.getLatitude())
                .longitude(dto.getLongitude())
                .travel(TravelResponse.fromDto(dto.getTravel()))
                .status(dto.getStatus())
                .build();
    }
}