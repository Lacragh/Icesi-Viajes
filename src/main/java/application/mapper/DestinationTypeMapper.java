package application.mapper;

import application.domain.DestinationType;
import application.dto.DestinationTypeDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface DestinationTypeMapper {

    DestinationTypeDTO toDestinationTypeDTO(DestinationType entity);

    DestinationType toDestinationType(DestinationTypeDTO entity);

    List<DestinationTypeDTO> toDestinationTypeDTO(List<DestinationType> entity);

    List<DestinationType> toDestinationType(List<DestinationTypeDTO> entity);

}
