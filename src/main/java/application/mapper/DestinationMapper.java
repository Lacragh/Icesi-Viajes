package application.mapper;

import application.domain.Destination;
import application.dto.DestinationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface DestinationMapper {

    @Mapping(source = "destinationType.id_desType", target = "destinationType")
    DestinationDTO toDestinationDTO(Destination entity);

    @Mapping(source = "destinationType", target = "destinationType.id_desType")
    Destination toDestination(DestinationDTO entity);

    @Mapping(source = "destinationType.id_desType", target = "destinationType")
    List<DestinationDTO> toDestinationDTO(List<Destination> entity);

    @Mapping(source = "destinationType", target = "destinationType.id_desType")
    List<Destination> toDestination(List<DestinationDTO> entity);

}
