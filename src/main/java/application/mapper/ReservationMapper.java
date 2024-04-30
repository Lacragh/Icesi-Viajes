package application.mapper;

import application.domain.Reservation;
import application.dto.ReservationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ReservationMapper {

    @Mapping(source = "destinationType", target = "destinationType")
    ReservationDTO toReservationDTO(Reservation entity);

    @Mapping(source = "destinationType", target = "destinationType")
    Reservation toReservation(ReservationDTO entity);

    @Mapping(source = "destinationType", target = "destinationType")
    List<ReservationDTO> toReservationDTO(List<Reservation> entity);

    @Mapping(source = "destinationType", target = "destinationType")
    List<Reservation> toReservation(List<ReservationDTO> entity);

}
